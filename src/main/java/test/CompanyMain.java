package test;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
class Company {
    private int companyId;
    private String companyName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
}

public class CompanyMain {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Company company = Company.builder()
                .companyId(100)
                .companyName("Apple")
                .address("Apple Computer Inc. 1 infinite Loop")
                .city("Cupertino")
                .state("CA")
                .zipCode("95014")
                .build();

        String companyInfo = gson.toJson(company);
        System.out.println(companyInfo);

        //or
        //gson 빌더를 사용해 값 입력.
        Company company2 = new Company(100,"apple","apple computer","cupertino","ca","95014");
        String companyInfo2 = gson.toJson(company2);
        System.out.println(companyInfo2);
    }
}
