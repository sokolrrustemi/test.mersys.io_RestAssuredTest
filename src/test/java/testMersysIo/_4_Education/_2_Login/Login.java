package testMersysIo._4_Education._2_Login;

import com.github.javafaker.Faker;
import io.restassured.specification.RequestSpecification;

public class Login {

    // * Login
    public String urlLog="/auth/login";
    public String  username="username"; // before running test please enter the correct username 
    public String  password="password"; // before running test please enter the correct password 
    public String url=" https://test.mersys.io/school-service/api/";
    public Faker randomUreteci=new Faker();

    public RequestSpecification reqSpec;

    // * Country
    public String CountryName="";
    public String CountryCode="";
    public String countryID="";

    // * Bank Accounts
    public String bankAccountID;
    public String bankAccountUserName;

    // * Grade Levels
    public String gradelevelID;
    public String gradelevelName;
    public String gradelevelShortName;

    // * Document Type

    public String documentTypeName;
    public String attachmentStages;

    // * Bank Fields
    public String fieldName;
    public String fieldID;
    public String fieldCode;
    public String newfieldName;
    public String newfieldCode;

    // * Discounts
    public String discountID;
    public String discountDescription;
    public String discountCode;

    // * Nationalities
    public String NationalitiesID;
    public String NationalitiesName;

    // * Department
    public String departmentsId="";
    public String departmentsName="";
    public Faker faker =new Faker();

    // * Location
    public String SchoolLocationID;
    public String SchoolLocationName;
    public String SchoolLocationShortName;
    public String SchoolLocationCapacity;

    // * Positions
    public String positionsID;
    public String positionsName;
    public String positionsShort;

    // * Attestations

    public String attestationID;
    public String attestationName;

    // * Position Categories
    public  String CategoriesID;
    public  String CategoriesName;;

    // * Subject Categories
    public String subjectID;
    public String subjectName;
    public String subjectCode;


   }
