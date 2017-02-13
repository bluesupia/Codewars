import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by supersupa on 2017. 2. 13..
 */
public class PhoneDirTest {
    String dr = "/+1-541-754-3010 156 Alphand_St. <J Steeve>\n 133, Green, Rd. <E Kustur> NY-56423 ;+1-541-914-3010\n"
            + "+1-541-984-3012 <P Reed> /PO Box 530; Pollocksville, NC-28573\n :+1-321-512-2222 <Paul Dive> Sequoia Alley PQ-67209\n"
            + "+1-741-984-3090 <Peter Reedgrave> _Chicago\n :+1-921-333-2222 <Anna Stevens> Haramburu_Street AA-67209\n"
            + "+1-111-544-8973 <Peter Pan> LA\n +1-921-512-2222 <Wilfrid Stevens> Wild Street AA-67209\n"
            + "<Peter Gone> LA ?+1-121-544-8974 \n <R Steell> Quora Street AB-47209 +1-481-512-2222\n"
            + "<Arthur Clarke> San Antonio $+1-121-504-8974 TT-45120\n <Ray Chandler> Teliman Pk. !+1-681-512-2222! AB-47209,\n"
            + "<Sophia Loren> +1-421-674-8974 Bern TP-46017\n <Peter O'Brien> High Street +1-908-512-2222; CC-47209\n"
            + "<Anastasia> +48-421-674-8974 Via Quirinal Roma\n <P Salinger> Main Street, +1-098-512-2222, Denver\n"
            + "<C Powel> *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000\n <Bernard Deltheil> +1-498-512-2222; Mount Av.  Eldorado\n"
            + "+1-099-500-8000 <Peter Crush> Labrador Bd.\n +1-931-512-4855 <William Saurin> Bison Street CQ-23071\n"
            + "<P Salinge> Main Street, +1-098-512-2222, Denve\n"+ "<P Salinge> Main Street, +1-098-512-2222, Denve\n";

    String dr2 = "/+1-541-754-3010 156 Alphand_St. \n" +
            " 133, Green, Rd.  NY-56423 ;+1-541-914-3010\n" +
            "+1-541-984-3012 \n" +
            " /PO Box 530; Pollocksville, NC-28573\n" +
            " :+1-321-512-2222  Sequoia Alley PQ-67209\n" +
            "+1-741-984-3090  _Chicago\n" +
            " :+1-921-333-2222  Haramburu_Street AA-67209\n" +
            "+1-111-544-8973  LA\n" +
            " +1-921-512-2222  Wild Street AA-67209\n" +
            " LA ?+1-121-544-8974 \n" +
            "  Quora Street AB-47209 +1-481-512-2222\n" +
            " San Antonio $+1-121-504-8974 TT-45120\n" +
            "  Teliman Pk. !+1-681-512-2222! AB-47209,\n" +
            " +1-421-674-8974 Bern TP-46017\n" +
            "  High Street +1-908-512-2222; CC-47209\n" +
            " +48-421-674-8974 Via Quirinal Roma\n" +
            " \n" +
            "\n" +
            " Main Street, +1-098-512-2222, Denver\n" +
            " *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000\n" +
            "  +1-498-512-2222; Mount Av.  Eldorado\n" +
            "+1-099-500-8000  Labrador Bd.\n" +
            " +1-931-512-4855  Bison Street CQ-23071\n" +
            "\n" +
            " Main Street, +1-098-512-2222, Denve\n" +
            "\n" +
            " Main Street, +1-098-512-2222, Denve\n" +
            "/+5-541-754-3010 156 Alphandria_Street. \n" +
            " 1333, Green, Road  NW-46423 ;+6-541-914-3010!\n" +
            "+5-541-984-3012  /PO Box 5300; Albertville, SC-28573\n" +
            " :+5-321-512-2222  Boulder Alley ZQ-87209\n" +
            "+3-741-984-3090  _Chicago Av.\n" +
            " :+3-921-333-2222  Bellevue_Street DA-67209\n" +
            "+8-111-544-8973  SA\n" +
            " +8-921-512-2222  Joly Street EE-67209\n" +
            " Mantow ?+2-121-544-8974 \n" +
            "  Eleonore Street QB-87209 +2-481-512-2222?\n" +
            " San Antonio $+7-121-504-8974 TT-45121\n" +
            "  Stevenson Pk. !+7-681-512-2222! CB-47209,\n" +
            " +9-421-674-8974 New-Bern TP-16017\n" +
            " \n" +
            "\n" +
            " Revolution Street +2-908-512-2222; PP-47209\n" +
            " +8-421-674-8974 Via Papa Roma\n" +
            "  Main Street, +15-098-512-2222, Boulder\n" +
            " *+9-421-674-8974 Edinburgh UK\n" +
            "  +3-498-512-2222; Hill Av.  Cameron\n" +
            "+12-099-500-8000  Ontario Bd.\n" +
            " +8-931-512-4855  Oxford Street CQ-23071\n" +
            " Moon Street, +3-098-512-2222, Peterville\n" ;

    String dr3 = "/+1-541-754-3010 156 Alphand_St. \n" +
            " 133, Green, Rd.  NY-56423 ;+1-541-914-3010\n" +
            "+1-541-984-3012 \n" +
            "\n" +
            " /PO Box 530; Pollocksville, NC-28573\n" +
            " :+1-321-512-2222  Sequoia Alley PQ-67209\n" +
            "+1-741-984-3090  _Chicago\n" +
            " :+1-921-333-2222  Haramburu_Street AA-67209\n" +
            "+1-111-544-8973  LA\n" +
            " +1-921-512-2222  Wild Street AA-67209\n" +
            " LA ?+1-121-544-8974 \n" +
            "  Quora Street AB-47209 +1-481-512-2222\n" +
            " San Antonio $+1-121-504-8974 TT-45120\n" +
            "  Teliman Pk. !+1-681-512-2222! AB-47209,\n" +
            " +1-421-674-8974 Bern TP-46017\n" +
            "  High Street +1-908-512-2222; CC-47209\n" +
            " +48-421-674-8974 Via Quirinal Roma\n" +
            " \n" +
            "\n" +
            " Main Street, +1-098-512-2222, Denver\n" +
            " *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000\n" +
            "  +1-498-512-2222; Mount Av.  Eldorado\n" +
            "+1-099-500-8000  Labrador Bd.\n" +
            " +1-931-512-4855  Bison Street CQ-23071\n" +
            "\n" +
            " Main Street, +1-098-512-2222, Denve\n" +
            "\n" +
            " Main Street, +1-098-512-2222, Denve\n" +
            "/+5-541-754-3010 156 Alphandria_Street. \n" +
            " 1333, Green, Road  NW-46423 ;+6-541-914-3010!\n" +
            "+5-541-984-3012  /PO Box 5300; Albertville, SC-28573\n" +
            " :+5-321-512-2222  Boulder Alley ZQ-87209\n" +
            "+3-741-984-3090  _Chicago Av.\n" +
            " :+3-921-333-2222  Bellevue_Street DA-67209\n" +
            "+8-111-544-8973  SA\n" +
            " +8-921-512-2222  Joly Street EE-67209\n" +
            " Mantow ?+2-121-544-8974 \n" +
            "  Eleonore Street QB-87209 +2-481-512-2222?\n" +
            " San Antonio $+7-121-504-8974 TT-45121\n" +
            "  Stevenson Pk. !+7-681-512-2222! CB-47209,\n" +
            " +9-421-674-8974 New-Bern TP-16017\n" +
            " \n" +
            "\n" +
            " Revolution Street +2-908-512-2222; PP-47209\n" +
            " +8-421-674-8974 Via Papa Roma\n" +
            "  Main Street, +15-098-512-2222, Boulder\n" +
            " *+9-421-674-8974 Edinburgh UK\n" +
            "  +3-498-512-2222; Hill Av.  Cameron\n" +
            "+12-099-500-8000  Ontario Bd.\n" +
            " +8-931-512-4855  Oxford Street CQ-23071\n" +
            " Moon Street, +3-098-512-2222, Peterville";
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: phone");
        testing(PhoneDir.phone(dr, "48-421-674-8974"), "Phone => 48-421-674-8974, Name => Anastasia, Address => Via Quirinal Roma");
        testing(PhoneDir.phone(dr, "1-921-512-2222"), "Phone => 1-921-512-2222, Name => Wilfrid Stevens, Address => Wild Street AA-67209");
        testing(PhoneDir.phone(dr, "1-908-512-2222"), "Phone => 1-908-512-2222, Name => Peter O'Brien, Address => High Street CC-47209");
        testing(PhoneDir.phone(dr, "1-541-754-3010"), "Phone => 1-541-754-3010, Name => J Steeve, Address => 156 Alphand St.");
        testing(PhoneDir.phone(dr, "1-121-504-8974"), "Phone => 1-121-504-8974, Name => Arthur Clarke, Address => San Antonio TT-45120");
        testing(PhoneDir.phone(dr, "1-498-512-2222"), "Phone => 1-498-512-2222, Name => Bernard Deltheil, Address => Mount Av. Eldorado");
        testing(PhoneDir.phone(dr, "1-098-512-2222"), "Error => Too many people: 1-098-512-2222");
        testing(PhoneDir.phone(dr, "5-555-555-5555"), "Error => Not found: 5-555-555-5555");
    }

    @Test
    public void test2() {
        testing(PhoneDir.phone(dr2, "48-421-674-8974"), "Phone => 48-421-674-8974, Name => , Address => Via Quirinal Roma");
        testing(PhoneDir.phone(dr2, "19-421-674-8974"), "Phone => 19-421-674-8974, Name => , Address => Chateau des Fosses Strasbourg F-68000");
        testing(PhoneDir.phone(dr3, "8-421-674-8974"), "Phone => 8-421-674-8974, Name => , Address => Via Papa Roma");
    }

    @Test
    public void test4() {
        testing(PhoneDir.phone(dr3, "5-541-984-3012"), "Phone => 5-541-984-3012, Name => , Address => PO Box 5300 Albertville SC-28573");
    }

}