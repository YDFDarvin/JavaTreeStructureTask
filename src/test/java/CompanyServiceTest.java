import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


/* edu
 *
 * variant 2
 *
 * by Andrukh Sergey
 * 243(2), IFTKN,
 * department Software Engineering
 *
 * 10/17/19
 *
 * (c) YDFD corporated
 */

public class CompanyServiceTest {

    @Test
    public void shouldGiveFirstEmployeeCountWhenCompanyIsOnTail() {
        //given
        Company company1 = new Company(null, 1);
        Company company11 = new Company(null, 2);
        Company company12 = new Company(company11, 4);
        Company company2 = new Company(company1, 3);
        Company company3 = new Company(company2, 5);
        Company company4 = new Company(company2, 7);
        Company company5 = new Company(company1, 9);
        Company company6 = new Company(company5, 11);
        Company company7 = new Company(company4, 13);

        //when
        List<Company> list = new ArrayList<Company>();
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
        CompanyService companyService = new CompanyService();

        //then
        Assert.assertEquals(1, companyService.getTopLevelParent(company6).getEmployeesCount(), 001);
 /*       Assert.assertEquals(1, companyService.getTopLevelParent(company1).getEmployeesCount(), 001);
        Assert.assertEquals(1, companyService.getTopLevelParent(company2).getEmployeesCount(), 001);
        Assert.assertEquals(1, companyService.getTopLevelParent(company4).getEmployeesCount(), 001);
        Assert.assertEquals(2, companyService.getTopLevelParent(company12).getEmployeesCount(), 001);*/
    }

    @Test
    public void shouldGiveFirstEmployeeCountWhenCompanyIsOnTop() {
        //given
        Company company1 = new Company(null, 1);
        Company company11 = new Company(null, 2);
        Company company12 = new Company(company11, 4);
        Company company2 = new Company(company1, 3);
        Company company3 = new Company(company2, 5);
        Company company4 = new Company(company2, 7);
        Company company5 = new Company(company1, 9);
        Company company6 = new Company(company5, 11);
        Company company7 = new Company(company4, 13);

        //when
        List<Company> list = new ArrayList<Company>();
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
        CompanyService companyService = new CompanyService();

        //then
        Assert.assertEquals(1, companyService.getTopLevelParent(company1).getEmployeesCount(), 001);
    }

    @Test
    public void shouldGiveFirstEmployeeCountWhenCompanyIsOnTheFork() {
        //given
        Company company1 = new Company(null, 1);
        Company company11 = new Company(null, 2);
        Company company12 = new Company(company11, 4);
        Company company2 = new Company(company1, 3);
        Company company3 = new Company(company2, 5);
        Company company4 = new Company(company2, 7);
        Company company5 = new Company(company1, 9);
        Company company6 = new Company(company5, 11);
        Company company7 = new Company(company4, 13);

        //when
        List<Company> list = new ArrayList<Company>();
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
        CompanyService companyService = new CompanyService();

        //then
        Assert.assertEquals(1, companyService.getTopLevelParent(company2).getEmployeesCount(), 001);
    }

    @Test
    public void shouldGiveFirstEmployeeCountWhenCompanyIsOnBranch() {
        //given
        Company company1 = new Company(null, 1);
        Company company11 = new Company(null, 2);
        Company company12 = new Company(company11, 4);
        Company company2 = new Company(company1, 3);
        Company company3 = new Company(company2, 5);
        Company company4 = new Company(company2, 7);
        Company company5 = new Company(company1, 9);
        Company company6 = new Company(company5, 11);
        Company company7 = new Company(company4, 13);

        //when
        List<Company> list = new ArrayList<Company>();
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
        CompanyService companyService = new CompanyService();

        //then
        Assert.assertEquals(1, companyService.getTopLevelParent(company4).getEmployeesCount(), 001);
    }

    @Test
    public void shouldGiveSecondEmployeeCountWhenCompanyIsFromAnotherTree() {
        //given
        Company company1 = new Company(null, 1);
        Company company11 = new Company(null, 2);
        Company company12 = new Company(company11, 4);
        Company company2 = new Company(company1, 3);
        Company company3 = new Company(company2, 5);
        Company company4 = new Company(company2, 7);
        Company company5 = new Company(company1, 9);
        Company company6 = new Company(company5, 11);
        Company company7 = new Company(company4, 13);

        //when
        List<Company> list = new ArrayList<Company>();
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
        CompanyService companyService = new CompanyService();

        //then
        Assert.assertEquals(2, companyService.getTopLevelParent(company12).getEmployeesCount(), 001);
    }

    @Test
    public void shouldGiveFourtyNineEmployeeCountWhenCompanyDividingHeadIsOnTop() {
        //given
        Company company1 = new Company(null, 1);
        Company company11 = new Company(null, 2);
        Company company12 = new Company(company11, 4);
        Company company2 = new Company(company1, 3);
        Company company3 = new Company(company2, 5);
        Company company4 = new Company(company2, 7);
        Company company5 = new Company(company1, 9);
        Company company6 = new Company(company5, 11);
        Company company7 = new Company(company4, 13);

        //when
        List<Company> list = new ArrayList<Company>();
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
        CompanyService companyService = new CompanyService();

        //then
        Assert.assertEquals( 49,companyService.getEmployeeCountForCompanyAndChildren(company1, list), 001);
    }

    @Test
    public void shouldGiveTwentyEightEmployeeCountWhenCompanyDividingHeadIsOnFork() {
        //given
        Company company1 = new Company(null, 1);
        Company company11 = new Company(null, 2);
        Company company12 = new Company(company11, 4);
        Company company2 = new Company(company1, 3);
        Company company3 = new Company(company2, 5);
        Company company4 = new Company(company2, 7);
        Company company5 = new Company(company1, 9);
        Company company6 = new Company(company5, 11);
        Company company7 = new Company(company4, 13);

        //when
        List<Company> list = new ArrayList<Company>();
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
        CompanyService companyService = new CompanyService();

        //then
        Assert.assertEquals( 28,companyService.getEmployeeCountForCompanyAndChildren(company2, list), 001);
    }

    @Test
    public void shouldGiveThirteenEmployeeCountWhenCompanyDividingHeadIsOnPop() {
        //given
        Company company1 = new Company(null, 1);
        Company company11 = new Company(null, 2);
        Company company12 = new Company(company11, 4);
        Company company2 = new Company(company1, 3);
        Company company3 = new Company(company2, 5);
        Company company4 = new Company(company2, 7);
        Company company5 = new Company(company1, 9);
        Company company6 = new Company(company5, 11);
        Company company7 = new Company(company4, 13);

        //when
        List<Company> list = new ArrayList<Company>();
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
        CompanyService companyService = new CompanyService();

        //then
        Assert.assertEquals( 13,companyService.getEmployeeCountForCompanyAndChildren(company7, list), 001);
    }

    @Test
    public void shouldGiveTwentyEmployeeCountWhenCompanyDividingHeadIsOnTheBranch() {
        //given
        Company company1 = new Company(null, 1);
        Company company11 = new Company(null, 2);
        Company company12 = new Company(company11, 4);
        Company company2 = new Company(company1, 3);
        Company company3 = new Company(company2, 5);
        Company company4 = new Company(company2, 7);
        Company company5 = new Company(company1, 9);
        Company company6 = new Company(company5, 11);
        Company company7 = new Company(company4, 13);

        //when
        List<Company> list = new ArrayList<Company>();
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
        CompanyService companyService = new CompanyService();

        //then
        Assert.assertEquals( 20,companyService.getEmployeeCountForCompanyAndChildren(company4, list), 001);
    }

    @Test
    public void shouldGiveZeroEmployeeCountWhenCompanyDividingHeadIsFromAnotherTree() {
        //given
        Company company1 = new Company(null, 1);
        Company company11 = new Company(null, 2);
        Company company12 = new Company(company11, 4);
        Company company2 = new Company(company1, 3);
        Company company3 = new Company(company2, 5);
        Company company4 = new Company(company2, 7);
        Company company5 = new Company(company1, 9);
        Company company6 = new Company(company5, 11);
        Company company7 = new Company(company4, 13);

        //when
        List<Company> list = new ArrayList<Company>();
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
        CompanyService companyService = new CompanyService();

        //then
        Assert.assertEquals( 0,companyService.getEmployeeCountForCompanyAndChildren(company12, list), 001);
    }
}