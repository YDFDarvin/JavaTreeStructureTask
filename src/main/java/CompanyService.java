/* ProhorTask
 *
 * variant 2
 *
 * by Andrukh Sergey
 * 243(2), IFTKN,
 * department Software Engineering
 *
 * 10/16/19
 *
 * (c) YDFD corporated
 */


import java.util.List;

public class CompanyService implements ICompanyService {

    @Override
    public Company getTopLevelParent(Company child) {
        return child.getParent() != null ? getTopLevelParent(child.getParent()) : child;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        return companies.stream().filter(companyI -> getHeadOfChain(company, companyI) != null)
                .mapToLong(Company::getEmployeesCount).sum();
    }

    public Company getHeadOfChain(Company headOfChainCompany, Company tailOfChainCompany) {
        return tailOfChainCompany.equals(headOfChainCompany)
                ? tailOfChainCompany : (tailOfChainCompany.getParent() == null
                ? null : getHeadOfChain(headOfChainCompany, tailOfChainCompany.getParent()));
    }

}
