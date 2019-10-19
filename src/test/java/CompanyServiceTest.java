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

    private final Company company1 = new Company(null, 1);
    private final Company company11 = new Company(null, 2);
    private final Company company12 = new Company(company11, 4);
    private final Company company2 = new Company(company1, 3);
    private final Company company3 = new Company(company2, 5);
    private final Company company4 = new Company(company2, 7);
    private final Company company5 = new Company(company1, 9);
    private final Company company6 = new Company(company5, 11);
    private final Company company7 = new Company(company4, 13);

    private final List<Company> list = new ArrayList<Company>();
    private final ICompanyService companyService = new CompanyService();

    public CompanyServiceTest() {
        list.add(company1);
        list.add(company2);
        list.add(company3);
        list.add(company4);
        list.add(company5);
        list.add(company6);
        list.add(company7);
    }

    @Test
    public void shouldGiveFirstEmployeeCountWhenCompanyIsOnTail() {
        //given

        //when

        //then
        Assert.assertEquals(1, companyService.getTopLevelParent(company6).getEmployeesCount(), 001);
    }

    @Test
    public void shouldGiveFirstEmployeeCountWhenCompanyIsOnTop() {
        //given

        //when

        //then
        Assert.assertEquals(1, companyService.getTopLevelParent(company1).getEmployeesCount(), 001);
    }

    @Test
    public void shouldGiveFirstEmployeeCountWhenCompanyIsOnTheFork() {
        //given

        //when

        //then
        Assert.assertEquals(1, companyService.getTopLevelParent(company2).getEmployeesCount(), 001);
    }

    @Test
    public void shouldGiveFirstEmployeeCountWhenCompanyIsOnBranch() {
        //given

        //when

        //then
        Assert.assertEquals(1, companyService.getTopLevelParent(company4).getEmployeesCount(), 001);
    }

    @Test
    public void shouldGiveSecondEmployeeCountWhenCompanyIsFromAnotherTree() {
        //given

        //when

        //then
        Assert.assertEquals(2, companyService.getTopLevelParent(company12).getEmployeesCount(), 001);
    }

    @Test
    public void shouldGiveFourtyNineEmployeeCountWhenCompanyDividingHeadIsOnTop() {
        //given

        //when

        //then
        Assert.assertEquals( 49,companyService.getEmployeeCountForCompanyAndChildren(company1, list), 001);
    }

    @Test
    public void shouldGiveTwentyEightEmployeeCountWhenCompanyDividingHeadIsOnFork() {
        //given

        //when

        //then
        Assert.assertEquals( 28,companyService.getEmployeeCountForCompanyAndChildren(company2, list), 001);
    }

    @Test
    public void shouldGiveThirteenEmployeeCountWhenCompanyDividingHeadIsOnPop() {
        //given

        //when

        //then
        Assert.assertEquals( 13,companyService.getEmployeeCountForCompanyAndChildren(company7, list), 001);
    }

    @Test
    public void shouldGiveTwentyEmployeeCountWhenCompanyDividingHeadIsOnTheBranch() {
        //given

        //when

        //then
        Assert.assertEquals( 20,companyService.getEmployeeCountForCompanyAndChildren(company4, list), 001);
    }

    @Test
    public void shouldGiveZeroEmployeeCountWhenCompanyDividingHeadIsFromAnotherTree() {
        //given

        //when

        //then
        Assert.assertEquals( 0,companyService.getEmployeeCountForCompanyAndChildren(company12, list), 001);
    }
}