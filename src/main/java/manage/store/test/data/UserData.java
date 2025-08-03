package manage.store.test.data;


import manage.store.domain.model.money.sales.value.Money;
import manage.store.domain.model.user.user.User;
import manage.store.domain.model.user.value.*;

import java.time.LocalDate;

/**
 * Test용 임의 데이터
 */
public class UserData {
//    private static final String email = "JumpingParkManager@gmail.com";

    public static User user1() {
        return User.builder()
                .id(new UserId("testerId1"))
                .password("$2a$10$GSis.dob/tMyiVXui7UNDOI5hlcnvbL3ryW8kIaGT7D31FcKK2OI.")
                .name(new UserName("테스트1"))
                .residentRegistNo(new ResidentRegistNo("1231231231231"))
                .phoneNo(new PhoneNo("11111111111"))
                .email(new Email("JumpingParkManager1@gmail.com"))
                .address("test address 1")
                .authCd(new UserAuthCode("ROLE_ADMIN"))
                .workStartDate(new WorkDate(LocalDate.of(2024, 1, 1)))
                .workEndDate(null)
                .workStatusCd(new WorkStatusCode("ING"))
                .bankName("BANK1")
                .bankAccountNo("1231231231")
                .monthSalary(new Salary(2000000L))
                .hourWage(new Salary(0L))
                .otpNo(new OtpNo("otp1"))
                .createdBy(new UserId("hs.lee0130"))
                .lastUpdatedBy(new UserId("hs.lee0130"))
                .build();
    }

    public static User user2() {
        return User.builder()
                .id(new UserId("testerId2"))
                .password("$2a$10$qa90EbI.v1OxaE1cWc/pSu6HHkWPb6/LSwqo9aBx5mCnzJqwH115.")
                .name(new UserName("테스트2"))
                .residentRegistNo(new ResidentRegistNo("1234123412341"))
                .phoneNo(new PhoneNo("22222222222"))
                .email(new Email("JumpingParkManager2@gmail.com"))
                .address("test address 2")
                .authCd(new UserAuthCode("ROLE_OWNER"))
                .workStartDate(new WorkDate(LocalDate.of(2024, 2, 1)))
                .workEndDate(new WorkDate(LocalDate.of(2024, 12, 31)))
                .workStatusCd(new WorkStatusCode("END"))
                .bankName("BANK2")
                .bankAccountNo("1234123412")
                .monthSalary(new Salary(0L))
                .hourWage(new Salary(10000L))
                .otpNo(new OtpNo("otp2"))
                .createdBy(new UserId("hs.lee0130"))
                .lastUpdatedBy(new UserId("hs.lee0130"))
                .build();
    }

    public static User user3() {
        return User.builder()
                .id(new UserId("testerId3"))
                .password("$2a$10$rCi9o8yyOGm7KzO2Q7kVH.fQShgIeEOTEMs.Md06LUynpqEq5oUYO")
                .name(new UserName("테스트3"))
                .residentRegistNo(new ResidentRegistNo("1234512345123"))
                .phoneNo(new PhoneNo("33333333333"))
                .email(new Email("JumpingParkManager3@gmail.com"))
                .address("test address 3")
                .authCd(new UserAuthCode("ROLE_MANAGER"))
                .workStartDate(new WorkDate(LocalDate.of(2024, 3, 1)))
                .workEndDate(null)
                .workStatusCd(new WorkStatusCode("ING"))
                .bankName("BANK3")
                .bankAccountNo("12345123451")
                .monthSalary(new Salary(12300000L))
                .hourWage(new Salary(0L))
                .otpNo(new OtpNo("otp3"))
                .createdBy(new UserId("hs.lee0130"))
                .lastUpdatedBy(new UserId("hs.lee0130"))
                .build();
    }

    public static User user4() {
        return User.builder()
                .id(new UserId("testerId4"))
                .password("$2a$10$GSis.dob/tMyiVXui7UNDOI5hlcnvbL3ryW8kIaGT7D31FcKK2OI.")
                .name(new UserName("테스트4"))
                .residentRegistNo(new ResidentRegistNo("1234561234561"))
                .phoneNo(new PhoneNo("44444444444"))
                .email(new Email("JumpingParkManager4@gmail.com"))
                .address("test address 4")
                .authCd(new UserAuthCode("ROLE_ADMIN"))
                .workStartDate(new WorkDate(LocalDate.of(2024, 4, 1)))
                .workEndDate(null)
                .workStatusCd(new WorkStatusCode("ING"))
                .bankName("BANK4")
                .bankAccountNo("12341234124")
                .monthSalary(new Salary(3000000L))
                .hourWage(new Salary(0L))
                .otpNo(new OtpNo("otp4"))
                .createdBy(new UserId("hs.lee0130"))
                .lastUpdatedBy(new UserId("hs.lee0130"))
                .build();
    };

    public static User user5() {
        return User.builder()
                .id(new UserId("testerId5"))
                .password("$2a$10$GSis.dob/tMyiVXui7UNDOI5hlcnvbL3ryW8kIaGT7D31FcKK2OI.")
                .name(new UserName("테스트5"))
                .residentRegistNo(new ResidentRegistNo("1234567123456"))
                .phoneNo(new PhoneNo("55555555555"))
                .email(new Email("JumpingParkManager5@gmail.com"))
                .address("test address 5")
                .authCd(new UserAuthCode("ROLE_OWNER"))
                .workStartDate(new WorkDate(LocalDate.of(2024, 5, 1)))
                .workEndDate(null)
                .workStatusCd(new WorkStatusCode("ING"))
                .bankName("BANK5")
                .bankAccountNo("12341234125")
                .monthSalary(new Salary(0L))
                .hourWage(new Salary(15000L))
                .otpNo(new OtpNo("otp5"))
                .createdBy(new UserId("hs.lee0130"))
                .lastUpdatedBy(new UserId("hs.lee0130"))
                .build();
    }
}
