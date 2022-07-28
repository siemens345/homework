package Applicant;

public class Main {
    public static void main(String[] args) {
        Applicant applicant_1=new Applicant("Алексей",25,10);
        Applicant applicant_2=new Applicant("Дмитрий",15,100);
        Applicant applicant_3=new Applicant("Михаил",25,70);

        applicant_1.possibility_of_free_education();
        applicant_2.possibility_of_free_education();
        applicant_3.possibility_of_free_education();

    }
}
