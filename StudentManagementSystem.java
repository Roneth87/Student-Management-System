import java.util.*;

class Student{
		private String regNo;
		private String nic;
		private String name;
		private int prf;
		private int dbms;
		
		public Student(String regNo,String nic, String name, int prf, int dbms){
			this.regNo = regNo;
			this.nic = nic;
			this.name = name;
			this.prf = prf;
			this.dbms = dbms;
		}
		
		public void setregNo(String regNo){
			this.regNo = regNo;
		}
		public void setnic(String nic){
			this.nic = nic;
		}
		public void setname( String name){
			this.name = name;
		}
		public void setprf( int prf){
			this.prf = prf;
		}
		public void setdbms(int dbms){
			this.dbms = dbms;
		}
		
		public String getregNo(){
			return regNo;
		}
		public String getnic(){
			return nic;
		}public String getname(){
			return name;
		}public int getprf(){
			return prf;
		}public int getdbms(){
			return dbms;
		}
}

class batch{
	private int batchName;
	private int batchStatus;
	
	public batch(int batchName, int batchStatus){
		this.batchName = batchName;
		this.batchStatus = batchStatus;
	}
	
	public void setbatchName(int batchName){
		this.batchName = batchName;
	}
	public void setbatchStatus(int batchStatus){
		this.batchStatus = batchStatus;
	}
	
	public int getbatchName(){
		return batchName;
	}
	public int getbatchStatus(){
		return batchStatus;
	}
}



class StudentManagementSystem{
    // Batch status
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;

    // Batch data
    public static batch[] batchArray = {
		new batch(105,0),
		new batch(106,0),
		new batch(107,0),
		new batch(108,0),
		new batch(109,1),
		new batch(110,1),
	};
    

    // Student data
    public static Student[] StudentArray = {
		new Student("PR24105001", "199501012345", "Gunawardena Weerasinghe", 85, 66),
		new Student("PR24105002", "199503153872", "Senanayake Silva", 39, 45),
		new Student("PR24105003", "199506202198", "Silva Kumara", -1, 93),
		new Student("PR24105004", "199509102983", "Kumara Herath", 72, 58),
		new Student("PR24105005", "199511258739", "Rathnayake Herath", 44, -1),
		new Student("PR24105006", "199512303498", "Wijesinghe Bandara", 91, 37),
		new Student("PR24105007", "199502183764", "Rajapaksha Herath", 60, 88),
		new Student("PR24105008", "199504223198", "Senanayake Karunaratne", 38, 21),
		new Student("PR24105009", "199508153210", "Karunaratne Jayasinghe", 95, 79),
		new Student("PR24105010", "199510293417", "Gunawardena Silva", 49, 40),

		new Student("OR24105011", "199601102375", "Weerasinghe Rajapaksha", -1, 76),
		new Student("OR24105012", "199604182938", "Silva Rathnayake", 67, 54),
		new Student("OR24105013", "199606243879", "Fernando Perera", 23, -1),
		new Student("OR24105014", "199608142178", "Kumara Abeysekera", 58, 69),
		new Student("OR24105015", "199610312475", "Ekanayake Rathnayake", 88, 92),

		new Student("PR24105016", "199611173452", "Herath Gunawardena", 81, 25),
		new Student("PR24105017", "199603293481", "Abeysekera Silva", 73, 84),
		new Student("PR24105018", "199605083217", "Weerasinghe Silva", 29, 33),
		new Student("OR24105019", "199607232198", "Jayasinghe Dias", 62, 60),
		new Student("OR24105020", "199609192375", "Bandara Rathnayake", -1, 71),

		new Student("PR24105021", "199701212483", "Silva Perera", 79, 59),
		new Student("PR24105022", "199703132487", "De Silva Dias", 53, -1),
		new Student("OR24105023", "199706253478", "Abeysekera Jayasinghe", 94, 98),
		new Student("OR24105024", "199708083298", "Rajapaksha Senanayake", 47, 27),
		new Student("PR24105025", "199710243651", "Kumara Karunaratne", 35, 48),

		new Student("PR24106001", "199712152983", "Silva Abeysekera", 93, 35),
		new Student("PR24106002", "199702182734", "Jayasinghe Bandara", 15, 91),
		new Student("PR24106003", "199704293187", "Rathnayake Kumara", -1, 60),
		new Student("PR24106004", "199705142375", "Weerasinghe Rajapaksha", 82, -1),
		new Student("PR24106005", "199709083751", "Senanayake Herath", 45, 72),
		new Student("PR24106006", "199801032874", "Perera Ekanayake", 88, 49),
		new Student("PR24106007", "199803232871", "Herath Jayasinghe", 23, 26),
		new Student("PR24106008", "199806193428", "Kumara Gunawardena", 79, 80),
		new Student("PR24106009", "199808013764", "Abeysekera Silva", 37, 14),
		new Student("PR24106010", "199810242374", "Dias Fernando", -1, 89),
		new Student("OR24106011", "199812302984", "Karunaratne Weerasinghe", 68, 67),
		new Student("OR24106012", "199802152348", "Ekanayake Bandara", 100, -1),
		new Student("OR24106013", "199805213471", "Rajapaksha Kumara", 59, 31),
		new Student("OR24106014", "199807172398", "Silva De Silva", 29, 94),
		new Student("OR24106015", "199811283472", "Gunawardena Rathnayake", 92, 53),

		new Student("PR24106016", "199901122471", "Bandara Karunaratne", 12, 78),
		new Student("PR24106017", "199903052984", "Fernando Perera", 77, 5),
		new Student("PR24106018", "199906213874", "De Silva Silva", 38, 90),
		new Student("OR24106019", "199908093412", "Rajapaksha Gunawardena", 66, 24),
		new Student("OR24106020", "199910273894", "Herath Weerasinghe", 9, 86),

		new Student("PR24106021", "199912153482", "Karunaratne Dias", 84, 39),
		new Student("PR24106022", "199902202394", "Jayasinghe Silva", 51, -1),
		new Student("OR24106023", "199904163874", "Senanayake Abeysekera", 32, 61),
		new Student("OR24106024", "199907293481", "Silva Jayasinghe", -1, 73),
		new Student("PR24106025", "199911083479", "Rathnayake Kumara", 97, 100),

		new Student("PR24107001", "200001112374", "Gunawardena Kumara", 95, 38),
		new Student("PR24107002", "200003143478", "Rajapaksha Silva", -1, 91),
		new Student("PR24107003", "200006293874", "Perera Jayasinghe", 63, -1),
		new Student("PR24107004", "200008103471", "Silva Ekanayake", 88, 74),
		new Student("PR24107005", "200010252984", "Dias Senanayake", 32, 55),
		new Student("PR24107006", "200012043894", "Herath Abeysekera", 76, 82),
		new Student("PR24107007", "200002193874", "Rathnayake Fernando", 97, 66),
		new Student("PR24107008", "200004212374", "Kumara Herath", 54, 49),
		new Student("PR24107009", "200005183492", "Weerasinghe Silva", -1, 99),
		new Student("PR24107010", "200007153871", "Senanayake Karunaratne", 23, 13),

		new Student("OR24107011", "200101232984", "Abeysekera Silva", 90, 80),
		new Student("OR24107012", "200103083471", "Bandara Gunawardena", 35, 70),
		new Student("OR24107013", "200106273894", "Karunaratne Weerasinghe", 81, 93),
		new Student("OR24107014", "200108123984", "Perera Herath", 61, 36),
		new Student("OR24107015", "200110043728", "Fernando Dias", 44, 59),

		new Student("PR24107016", "200112213874", "Weerasinghe Gunawardena", 67, 85),
		new Student("PR24107017", "200102253471", "Rathnayake Kumara", 100, 47),
		new Student("PR24107018", "200104103874", "Senanayake Fernando", 17, 90),
		new Student("OR24107019", "200105293784", "Silva Bandara", 85, -1),
		new Student("OR24107020", "200107202983", "Herath Rajapaksha", 29, 22),

		new Student("PR24107021", "200201013874", "Kumara Jayasinghe", 70, 77),
		new Student("PR24107022", "200203253471", "Abeysekera Perera", 42, 34),
		new Student("OR24107023", "200206143874", "Rathnayake Jayasinghe", -1, 63),
		new Student("OR24107024", "200208083471", "Kumara Weerasinghe", 60, 100),
		new Student("PR24107025", "200210293874", "Rajapaksha Ekanayake", 86, 29),

		new Student("PR24108001", "200212183471", "Fernando Rajapaksha", 86, 79),
		new Student("PR24108002", "200202103874", "Silva Gunawardena", 57, 62),
		new Student("PR24108003", "200204123894", "Perera Wijesinghe", 91, 87),
		new Student("PR24108004", "200205283471", "Herath Abeysekera", 35, -1),
		new Student("PR24108005", "200207153874", "Rajapaksha Ekanayake", -1, 54),
		new Student("PR24108006", "200301093874", "Karunaratne Silva", 76, 46),
		new Student("PR24108007", "200303283471", "Weerasinghe Fernando", 48, 99),
		new Student("PR24108008", "200306153874", "Silva Bandara", 94, 39),
		new Student("PR24108009", "200308123471", "Abeysekera Weerasinghe", 23, 70),
		new Student("PR24108010", "200310083874", "Kumara Karunaratne", 69, -1),

		new Student("OR24108011", "200312243471", "Dias Rajapaksha", -1, 75),
		new Student("OR24108012", "200302273874", "Herath Perera", 80, 83),
		new Student("OR24108013", "200304203471", "Rathnayake Gunawardena", 55, 58),
		new Student("OR24108014", "200305123874", "Ekanayake Jayasinghe", 88, 92),
		new Student("OR24108015", "200307213471", "Gunawardena Silva", 32, 30),

		new Student("PR24108016", "200401153874", "Rajapaksha Perera", 100, 91),
		new Student("PR24108017", "200403123471", "Karunaratne Jayasinghe", 67, 40),
		new Student("PR24108018", "200406293874", "Weerasinghe Abeysekera", 43, 63),
		new Student("OR24108019", "200408083471", "Rathnayake Fernando", -1, 95),
		new Student("OR24108020", "200410213874", "Kumara Herath", 90, 68),

		new Student("PR24108021", "200412153471", "Silva Weerasinghe", 60, -1),
		new Student("PR24108022", "200402203874", "Herath Karunaratne", 77, 66),
		new Student("OR24108023", "200404273471", "Abeysekera Silva", 25, 21),
		new Student("OR24108024", "200405143874", "Gunawardena Ekanayake", 71, 88),
		new Student("PR24108025", "200407183471", "Weerasinghe Kumara", 84, 37),

		new Student("PR24109001", "200501023874", "Weerasinghe Kumara", 92, 67),
		new Student("PR24109002", "200503193471", "Rajapaksha Abeysekera", 68, 91),
		new Student("PR24109003", "200506153874", "Gunawardena Perera", 59, 85),
		new Student("PR24109004", "200508213471", "Karunaratne Silva", 85, 73),
		new Student("PR24109005", "200510083874", "Herath Wijesinghe", 63, 70),
		new Student("PR24109006", "200512293471", "Rathnayake Ekanayake", 76, 63),
		new Student("PR24109007", "200502123874", "Silva Fernando", 91, 76),
		new Student("PR24109008", "200504153471", "Abeysekera Rajapaksha", 70, 88),
		new Student("PR24109009", "200505283874", "Fernando Bandara", 84, 55),
		new Student("PR24109010", "200507173471", "Perera Herath", 63, 64),

		new Student("OR24109011", "200203456782", "Weerasinghe Jayasinghe", 72, 79),
		new Student("OR24109012", "200305678901", "Silva Karunaratne", 89, 80),
		new Student("OR24109013", "199601234567", "Rathnayake Gunawardena", 45, 59),
		new Student("OR24109014", "199511223344", "Herath Kumara", 81, 92),
		new Student("OR24109015", "200412345678", "Abeysekera Silva", 77, 68),

		new Student("PR24109016", "200512345678", "Ekanayake Bandara", 68, 100),
		new Student("PR24109017", "199909876543", "Rajapaksha Fernando", 63, 77),
		new Student("PR24109018", "199812346789", "Gunawardena Weerasinghe", 88, 83),
		new Student("OR24109019", "200010203040", "Kumara Karunaratne", 75, 45),
		new Student("OR24109020", "200608789012", "Silva Dias", 90, 62),

		new Student("PR24109021", "200012345678", "Perera Weerasinghe", 57, 66),
		new Student("PR24109022", "199812345679", "Karunaratne Rajapaksha", 79, 59),
		new Student("OR24109023", "199902345678", "Jayasinghe Silva", 92, 78),
		new Student("OR24109024", "199712345670", "Rathnayake Perera", 62, 85),
		new Student("PR24109025", "200102345671", "Silva Ekanayake", 100, 56),

		new Student("PR24110001", "200203456782", "Silva Karunaratne", -2, -2),
		new Student("PR24110002", "200305678901", "Herath Fernando", -2, -2),
		new Student("PR24110003", "199601234567", "Kumara Jayasinghe", -2, -2),
		new Student("PR24110004", "199511223344", "Weerasinghe Perera", -2, -2),
		new Student("PR24110005", "200412345678", "Abeysekera Rajapaksha", -2, -2),
		new Student("PR24110006", "200512345678", "Rathnayake Karunaratne", -2, -2),
		new Student("PR24110007", "199909876543", "Ekanayake Bandara", -2, -2),
		new Student("PR24110008", "199812346789", "Gunawardena Perera", -2, -2),
		new Student("PR24110009", "200010203040", "Silva Wijesinghe", -2, -2),
		new Student("PR24110010", "200608789012", "Rajapaksha Jayasinghe", -2, -2),

		new Student("OR24110011", "200012345678", "Rathnayake Fernando", -2, -2),
		new Student("OR24110012", "199812345679", "Karunaratne Kumara", -2, -2),
		new Student("OR24110013", "199902345678", "Perera Silva", -2, -2),
		new Student("OR24110014", "199712345670", "Gunawardena Ekanayake", -2, -2),
		new Student("OR24110015", "200102345671", "Bandara Rajapaksha", -2, -2),

		new Student("PR24110016", "200203456782", "Silva Herath", -2, -2),
		new Student("PR24110017", "200305678901", "Rathnayake Weerasinghe", -2, -2),
		new Student("PR24110018", "199601234567", "Perera Gunawardena", -2, -2),
		new Student("OR24110019", "199511223344", "Herath Karunaratne", -2, -2),
		new Student("OR24110020", "200412345678", "Silva Rajapaksha", -2, -2),

		new Student("PR24110021", "200203456782", "Ekanayake Kumara", -2, -2),
		new Student("PR24110022", "200305678901", "Bandara Herath", -2, -2),
		new Student("OR24110023", "199601234567", "Weerasinghe Rajapaksha", -2, -2),
		new Student("OR24110024", "199511223344", "Karunaratne Abeysekera", -2, -2),
		new Student("PR24110025", "200412345678", "Perera Dias", -2, -2)
    };

    // one Scanner for the whole program
    public static Scanner input = new Scanner(System.in);

    // =====================================================
    //  SMALL HELPER METHODS
    // =====================================================

    // console clear
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
           
        }
    }

    // Exit
    public static void exit() {
        clearConsole();
        System.out.println("\n\t\tYou left the program...\n");
        System.exit(0);
    }

    // print a title box
    public static void printTitle(String title) {
        int width = 71;
        int left = (width - title.length()) / 2;
        int right = width - title.length() - left;

        System.out.println("-------------------------------------------------------------------------");
        System.out.print("|");
        for (int i = 0; i < left; i++) {
            System.out.print(" ");
        }
        System.out.print(title);
        for (int i = 0; i < right; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------------------------------------------");
    }

    // read a line of text
    public static String readText(String message) {
        System.out.print(message);
        return input.nextLine().trim();
    }

    // read a text that is not empty
    public static String readNonEmpty(String message) {
        String text = readText(message);
        while (text.equals("")) {
            System.out.println("\n\tThis cannot be empty. Try again.\n");
            text = readText(message);
        }
        return text;
    }

    // read a number (asks again if the user types something else)
    public static int readInt(String message) {
        while (true) {
            String text = readText(message);
            try {
                return Integer.parseInt(text);
            } catch (NumberFormatException e) {
                System.out.println("\n\tInvalid input. Please enter a number.\n");
            }
        }
    }

    // read a menu option between min and max
    public static int readOption(String message, int min, int max) {
        int option = readInt(message);
        while (option < min || option > max) {
            System.out.println("\n\tInvalid option. Please try again.\n");
            option = readInt(message);
        }
        return option;
    }

    // read marks (-1 = absent, otherwise 0 to 100)
    public static int readMarks(String message) {
        int marks = readInt(message);
        while (marks != -1 && (marks < 0 || marks > 100)) {
            System.out.println("\n\tInvalid marks. Enter -1 (absent) or marks between 0 and 100.\n");
            marks = readInt(message);
        }
        return marks;
    }

    // ask a Y/N question
    public static boolean askYesNo(String message) {
        while (true) {
            String text = readText(message);
            if (text.equalsIgnoreCase("Y")) {
                return true;
            } else if (text.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("\n\tPlease enter Y or N.\n");
        }
    }

    // =====================================================
    //  SEARCH / CHECK METHODS
    // =====================================================

    // find student by registration number (-1 if not found)
    public static int findStudent(String registrationNo) {
        for (int i = 0; i < StudentArray.length; i++) {
            if (StudentArray[i].getregNo().equalsIgnoreCase(registrationNo)) {
                return i;
            }
        }
        return -1;
    }

    // find student by NIC (-1 if not found)
    public static int findStudentByNIC(String nic) {
        for (int i = 0; i < StudentArray.length; i++) {
            if (StudentArray[i].getnic().equals(nic)) {
                return i;
            }
        }
        return -1;
    }

    // find batch by batch number (-1 if not found)
    public static int findBatch(int batchNo) {
        for (int i = 0; i < batchArray.length; i++) {
            if (batchArray[i].getbatchName() == batchNo) {
                return i;
            }
        }
        return -1;
    }

    // get batch number from a registration number (OR24106020 -> 106)
    public static int getBatchOfStudent(Student s) {
        return Integer.parseInt(s.getregNo().substring(4, 7));
    }

    // count the students in a batch
    public static int countStudents(int batchNo) {
        int count = 0;
        for (int i = 0; i < StudentArray.length; i++) {
            if (getBatchOfStudent(StudentArray[i]) == batchNo) {
                count++;
            }
        }
        return count;
    }

    // create the next registration number for a batch
    public static String registrationNo(int mode, int batchNo) {
        int last = 0;

        // find the biggest student number in this batch
        for (int i = 0; i < StudentArray.length; i++) {
            if (getBatchOfStudent(StudentArray[i]) == batchNo) {
                int number = Integer.parseInt(StudentArray[i].getregNo().substring(7));
                if (number > last) {
                    last = number;
                }
            }
        }
        last++;

        String number = "" + last;
        while (number.length() < 3) {
            number = "0" + number;
        }

        if (mode == 1) {
            return "PR24" + batchNo + number;
        } else {
            return "OR24" + batchNo + number;
        }
    }

    // =====================================================
    //  GPA METHODS
    // =====================================================

    // GPA value for one subject
    public static double GetGPA(int marks) {
        if (marks >= 90) {
            return 4.25;
        } else if (marks >= 80) {
            return 4.00;
        } else if (marks >= 75) {
            return 3.70;
        } else if (marks >= 70) {
            return 3.30;
        } else if (marks >= 65) {
            return 3.00;
        } else if (marks >= 60) {
            return 2.70;
        } else if (marks >= 55) {
            return 2.30;
        } else if (marks >= 50) {
            return 2.00;
        } else if (marks >= 45) {
            return 1.70;
        } else if (marks >= 40) {
            return 1.30;
        } else if (marks >= 30) {
            return 1.00;
        } else if (marks >= 20) {
            return 0.70;
        } else {
            return 0.0;
        }
    }

    // Student GPA = (PRF GPA + DBMS GPA) / 2
    public static double CalculateGPA(Student s) {
        double prfGPA = 0.0;
        double dbmsGPA = 0.0;

        if (s.getprf() >= 0) {
            prfGPA = GetGPA(s.getprf());
        }
        if (s.getdbms() >= 0) {
            dbmsGPA = GetGPA(s.getdbms());
        }

        double gpa = (prfGPA + dbmsGPA) / 2;
        return Math.round(gpa * 1000) / 1000.0;
    }

    // marks as text (-1 = Absent, -2 = Not conducted)
    public static String marksText(int marks) {
        if (marks == -2) {
            return "Not conducted";
        } else if (marks == -1) {
            return "Absent";
        } else {
            return "" + marks;
        }
    }

    // print full student profile
    public static void printStudentDetails(Student s) {
        System.out.println();
        System.out.println("\tRegistration no    : " + s.getregNo());
        System.out.println("\tStudent Name       : " + s.getname());
        System.out.println("\tStudent NIC        : " + s.getnic());
        System.out.println("\tStudent PRF Marks  : " + marksText(s.getprf()));
        System.out.println("\tStudent DBMS Marks : " + marksText(s.getdbms()));
        System.out.println("\tStudent GPA        : " + CalculateGPA(s));
        System.out.println();
    }

    // =====================================================
    //  HOME PAGE
    // =====================================================

    public static void homePage() {
        while (true) {
            clearConsole();
            System.out.println("-----------------------------------------------------------------");
            System.out.println("|\t\t\tiCET Student Management System\t\t|");
            System.out.println("-----------------------------------------------------------------\n");
            System.out.println("[1] Student Management");
            System.out.println("\n[2] Batch Management ");
            System.out.println("\n[3] Grade Management");
            System.out.println("\n[4] Report Generator");
            System.out.println("\n[5] Exit");

            int option = readOption("\n\nEnter an option to continue > ", 1, 5);

            switch (option) {
                case 1:
                    clearConsole();
                    studentManagement();
                    break;
                case 2:
                    clearConsole();
                    batchManagement();
                    break;
                case 3:
                    clearConsole();
                    gradeManagement();
                    break;
                case 4:
                    clearConsole();
                    reportGenerator();
                    break;
                case 5:
                    exit();
                    break;
            }
        }
    }

    // =====================================================
    //  STUDENT MANAGEMENT
    // =====================================================

    public static void studentManagement() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tStudent Management\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] Add Student");
        System.out.println("\n[2] Update Student ");
        System.out.println("\n[3] View Student Profile");
        System.out.println("\n[4] Delete Student Profile");
        System.out.println("\n[5] Exit");

        int option = readOption("\n\nEnter an option to continue > ", 1, 5);

        switch (option) {
            case 1:
                clearConsole();
                addStudent();
                break;
            case 2:
                clearConsole();
                updateStudent();
                break;
            case 3:
                clearConsole();
                viewStudentProfile();
                break;
            case 4:
                clearConsole();
                deleteStudentProfile();
                break;
            case 5:
                break; 
        }
    }

    // Add Student
    public static void addStudent() {
        boolean again = true;

        while (again) {
            clearConsole();
            printTitle("Add Student");

            int batchNo = readInt("\nEnter Batch Number (Students should be added): ");
            int batchIndex = findBatch(batchNo);

            if (batchIndex == -1) {
                System.out.println("\n\tThis batch does not exist in the system.");
                again = askYesNo("\nDo you want to add student to another Batch (Y/N): ");

            } else if (batchArray[batchIndex].getbatchStatus() == ENROLLMENTCLOSED) {
                System.out.println("\n\tStudents cannot be added to this batch because enrollment is closed.");
                again = askYesNo("\nDo you want to add student to another Batch (Y/N): ");

            } else {
                String nic = readNonEmpty("\nEnter Student NIC: ");
                int oldIndex = findStudentByNIC(nic);

                if (oldIndex != -1) {
                    System.out.println("\n\tThis student is already added to the system.");
                    printStudentDetails(StudentArray[oldIndex]);
                } else {
                    String name = readNonEmpty("\nEnter Student Name: ");
                    int mode = readOption("\nEnter Lecturer Mode (1-PHYSICAL 0-ONLINE): ", 0, 1);

                    String regNo = registrationNo(mode, batchNo);

                    // extend the array by 1 and add the new student
                    Student[] tempStudentArray = new Student[StudentArray.length + 1];
                    for (int i = 0; i < StudentArray.length; i++) {
                        tempStudentArray[i] = StudentArray[i];
                    }
                    tempStudentArray[tempStudentArray.length - 1] = new Student(regNo, nic, name, -2, -2);
                    StudentArray = tempStudentArray;

                    System.out.println("\n\tStudent Registration No - " + regNo);
                    System.out.println("\nStudent was successfully added to the system.");
                }

                again = askYesNo("\nDo you want to add another student (Y/N): ");
            }
        }
    }

    // Update Student
    public static void updateStudent() {
        boolean again = true;

        while (again) {
            clearConsole();
            printTitle("Update Student");

            String regNo = readText("\nEnter Student Registration No: ");
            int index = findStudent(regNo);

            if (index == -1) {
                System.out.println("\n\tThis student not exist in the system.");
            } else {
                System.out.println("\n\tStudent Name  : " + StudentArray[index].getname());
                System.out.println("\tStudent NIC   : " + StudentArray[index].getnic());

                System.out.println("\nWhat do you want to update ?");
                System.out.println("\t(01) Student Name");
                System.out.println("\t(02) Student NIC");

                int option = readOption("\nEnter your option - ", 1, 2);
                clearConsole();

                if (option == 1) {
                    // update name
                    System.out.println("Student Name Update");
                    System.out.println("====================\n");
                    System.out.println("Registration No      : " + StudentArray[index].getregNo());
                    System.out.println("Student NIC          : " + StudentArray[index].getnic());
                    System.out.println("Student Current Name : " + StudentArray[index].getname());

                    String newName = readNonEmpty("\nEnter student name to update - ");
                    StudentArray[index].setname(newName);

                    System.out.println("\n\tStudent name updated successfully...");

                } else {
                    // update NIC
                    System.out.println("Student NIC Update");
                    System.out.println("====================\n");
                    System.out.println("Registration No     : " + StudentArray[index].getregNo());
                    System.out.println("Student Name        : " + StudentArray[index].getname());
                    System.out.println("Student Current NIC : " + StudentArray[index].getnic());

                    String newNIC = readNonEmpty("\nEnter student NIC to update - ");

                    if (findStudentByNIC(newNIC) != -1) {
                        System.out.println("\n\tThis student is already added to the system...");
                    } else {
                        StudentArray[index].setnic(newNIC);
                        System.out.println("\n\tStudent NIC updated successfully...");
                    }
                }
            }

            again = askYesNo("\nDo you want to update another student details (Y/N): ");
        }
    }

    // View Student Profile
    public static void viewStudentProfile() {
        boolean again = true;

        while (again) {
            clearConsole();
            printTitle("View Student's Profile");

            String regNo = readText("\nEnter Student Registration No: ");
            int index = findStudent(regNo);

            if (index == -1) {
                System.out.println("\n\tThis student does not exist in the system.");
            } else {
                printStudentDetails(StudentArray[index]);
            }

            again = askYesNo("\nDo you want to search another student details (Y/N): ");
        }
    }

    // Delete Student Profile
    public static void deleteStudentProfile() {
        boolean again = true;

        while (again) {
            clearConsole();
            printTitle("Delete Student Profile");

            String regNo = readText("\nEnter Student Registration No: ");
            int index = findStudent(regNo);

            if (index == -1) {
                System.out.println("\n\tThis student does not exist in the system.");
            } else {
                printStudentDetails(StudentArray[index]);

                if (askYesNo("Do you want to delete this student profile (Y/N): ")) {
                    // make a new array without this student
                    Student[] tempStudentArray = new Student[StudentArray.length - 1];
                    int j = 0;
                    for (int i = 0; i < StudentArray.length; i++) {
                        if (i != index) {
                            tempStudentArray[j] = StudentArray[i];
                            j++;
                        }
                    }
                    StudentArray = tempStudentArray;

                    System.out.println("\n\tStudent was successfully deleted from the system.");
                } else {
                    System.out.println("\n\tStudent deletion cancelled.");
                }
            }

            again = askYesNo("\nDo you want to delete another student profile (Y/N): ");
        }
    }

    // =====================================================
    //  BATCH MANAGEMENT
    // =====================================================

    public static void batchManagement() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tBatch Management\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] Add Batch");
        System.out.println("\n[2] Update Batch");
        System.out.println("\n[3] View Batches");
        System.out.println("\n[4] Exit");

        int option = readOption("\n\nEnter an option to continue > ", 1, 4);

        switch (option) {
            case 1:
                clearConsole();
                addBatch();
                break;
            case 2:
                clearConsole();
                updateBatch();
                break;
            case 3:
                clearConsole();
                viewBatches();
                break;
            case 4:
                break; 
        }
    }

    // Add Batch
    public static void addBatch() {
        boolean again = true;

        while (again) {
            clearConsole();
            printTitle("Add Batch");

            int batchNo = readInt("\nEnter Batch Number : ");

            if (batchNo < 100 || batchNo > 999) {
                System.out.println("\n\tBatch number must be between 100 and 999.");
            } else if (findBatch(batchNo) != -1) {
                System.out.println("\nBatch is already added to the system.");
            } else {
               
                batch[] tempBatchArray = new batch[batchArray.length + 1];
                for (int i = 0; i < batchArray.length; i++) {
                    tempBatchArray[i] = batchArray[i];
                }
                tempBatchArray[tempBatchArray.length - 1] = new batch(batchNo, ENROLLMENTOPEN);
                batchArray = tempBatchArray;

                System.out.println("\nBatch was successfully added to the system.");
            }

            again = askYesNo("\nDo you want to add another batch to the system (Y/N): ");
        }
    }

    // Update Batch
    public static void updateBatch() {
        boolean again = true;

        while (again) {
            clearConsole();
            printTitle("Update Batch");

            int batchNo = readInt("\nEnter Batch Number : ");
            int index = findBatch(batchNo);

            if (index == -1) {
                System.out.println("\nThis batch does not exist in the system.");
            } else {
                if (batchArray[index].getbatchStatus() == ENROLLMENTOPEN) {
                    System.out.println("Current Status : ENROLLMENT OPEN");

                    if (askYesNo("\nDo you want to change the batch status to ENROLLMENT CLOSED(Y/N) ? ")) {
                        batchArray[index].setbatchStatus(ENROLLMENTCLOSED);
                        System.out.println("\n\tBatch Status updated successfully...");
                    }
                } else {
                    System.out.println("Current Status : ENROLLMENT CLOSED");

                    if (askYesNo("\nDo you want to change the batch status to ENROLLMENT OPEN(Y/N) ? ")) {
                        batchArray[index].setbatchStatus(ENROLLMENTOPEN);
                        System.out.println("\n\tBatch Status updated successfully...");
                    }
                }
            }

            again = askYesNo("\nDo you want to update another batch details (Y/N): ");
        }
    }

    // View Batches
    public static void viewBatches() {
        boolean goHome = false;

        while (!goHome) {
            clearConsole();
            printTitle("View Batch");

            System.out.println("\n---------------------------------------------------");
            System.out.printf("%-5s %-10s %-15s %s\n", "No", "Batch No", "Student Count", "Status");
            System.out.println("---------------------------------------------------");

            for (int i = 0; i < batchArray.length; i++) {
                String status;
                if (batchArray[i].getbatchStatus() == ENROLLMENTOPEN) {
                    status = "ENROLLMENT OPEN";
                } else {
                    status = "ENROLLMENT CLOSED";
                }

                System.out.printf("%-5d %-10d %-15d %s\n", (i + 1), batchArray[i].getbatchName(),
                        countStudents(batchArray[i].getbatchName()), status);
            }
            System.out.println("---------------------------------------------------");

            goHome = askYesNo("\nDo you want to go to the home page (Y/N): ");
        }
    }

    // =====================================================
    //  GRADE MANAGEMENT
    // =====================================================

    public static void gradeManagement() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tGrade Management\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] PRF Marks Update");
        System.out.println("\n[2] DBMS Marks Update ");
        System.out.println("\n[3] Exit");

        int option = readOption("\n\nEnter an option to continue > ", 1, 3);

        switch (option) {
            case 1:
                clearConsole();
                prfMarksUpdate();
                break;
            case 2:
                clearConsole();
                dbmsMarksUpdate();
                break;
            case 3:
                break; 
        }
    }

    // PRF marks update
    public static void prfMarksUpdate() {
        marksUpdate("PRF");
    }

    // DBMS marks update
    public static void dbmsMarksUpdate() {
        marksUpdate("DBMS");
    }

    
    public static void marksUpdate(String module) {
        boolean again = true;

        while (again) {
            clearConsole();
            printTitle(module + " Marks Update");

            String regNo = readText("\nEnter Student Registration No: ");
            int index = findStudent(regNo);

            if (index == -1) {
                System.out.println("\n\tThis student does not exist in the system.");
            } else {
                Student s = StudentArray[index];

                System.out.println("\n\tRegistration no : " + s.getregNo());
                System.out.println("\tStudent Name    : " + s.getname());
                System.out.println("\tStudent NIC     : " + s.getnic());
                System.out.println();

               
                int currentMarks;
                if (module.equals("PRF")) {
                    currentMarks = s.getprf();
                } else {
                    currentMarks = s.getdbms();
                }

                boolean update = false;

                if (currentMarks == -2) {
                    update = true; 
                } else if (currentMarks == -1) {
                    System.out.println("This student was absent from the exam. You can update the marks if they participate in it..");
                    update = true;
                } else {
                    System.out.println("This student has already completed the " + module + " module.");
                    System.out.println("\t" + module + " Marks : " + currentMarks);
                    update = askYesNo("\nDo you want to update this student's " + module + " marks (Y/N): ");
                }

                if (update) {
                    int newMarks = readMarks("\tEnter " + module + " Marks : ");

                    if (module.equals("PRF")) {
                        s.setprf(newMarks);
                    } else {
                        s.setdbms(newMarks);
                    }

                    System.out.println("\n\tThis student " + module + " Marks updated successfully...");
                }
            }

            again = askYesNo("\nDo you want to update another student " + module + " marks (Y/N): ");
        }
    }

    // =====================================================
    //  REPORT GENERATOR
    // =====================================================

    public static void reportGenerator() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tReport Generator\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] Student Registration Report");
        System.out.println("\n[2] Batch-wise Student Report");
        System.out.println("\n[3] Industry Training Eligibility Report");
        System.out.println("\n[4] Exit");

        int option = readOption("\n\nEnter an option to continue > ", 1, 4);

        switch (option) {
            case 1:
                clearConsole();
                studentRegistrationReport();
                break;
            case 2:
                clearConsole();
                batchWiseStudentReport();
                break;
            case 3:
                clearConsole();
                industryTrainingEligibilityReport();
                break;
            case 4:
                break;
        }
    }

    
    public static Student[] sortByName(Student[] list) {
        Student[] sorted = new Student[list.length];
        for (int i = 0; i < list.length; i++) {
            sorted[i] = list[i];
        }

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                if (sorted[j].getname().compareToIgnoreCase(sorted[j + 1].getname()) > 0) {
                    Student temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }

   
    public static void printStudentTable(Student[] list) {
        System.out.println("\n-----------------------------------------------------------------------------------------------------");
        System.out.printf("%-4s %-14s %-26s %-15s %-11s %-12s %s\n",
                "No", "Registration No", "Student Name", "NIC", "PRF Marks", "DBMS Marks", "GPA");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        for (int i = 0; i < list.length; i++) {
            Student s = list[i];
            System.out.printf("%-4d %-15s %-26s %-15s %-11d %-12d %.2f\n",
                    (i + 1), s.getregNo(), s.getname(), s.getnic(), s.getprf(), s.getdbms(), CalculateGPA(s));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }

    // Student Registration Report
    public static void studentRegistrationReport() {
        boolean goHome = false;

        while (!goHome) {
            clearConsole();
            printTitle("Student Registration Report");

            Student[] sorted = sortByName(StudentArray);
            printStudentTable(sorted);

            goHome = askYesNo("\nDo you want to go to the home page (Y/N): ");
        }
    }

    // Batch-wise Student Report
    public static void batchWiseStudentReport() {
        boolean again = true;

        while (again) {
            clearConsole();
            printTitle("Batch-wise Student Report");
            System.out.println();

            for (int i = 0; i < batchArray.length; i++) {
                System.out.println("[" + (i + 1) + "] " + batchArray[i].getbatchName() + " Batch\n");
            }
            System.out.println("[" + (batchArray.length + 1) + "] Exit");

            int option = readOption("\nEnter an option to continue > ", 1, batchArray.length + 1);

            if (option == batchArray.length + 1) {
                return; 
            }

            int batchNo = batchArray[option - 1].getbatchName();

            
            Student[] batchStudents = new Student[countStudents(batchNo)];
            int j = 0;
            for (int i = 0; i < StudentArray.length; i++) {
                if (getBatchOfStudent(StudentArray[i]) == batchNo) {
                    batchStudents[j] = StudentArray[i];
                    j++;
                }
            }

            batchStudents = sortByName(batchStudents);

            clearConsole();
            printTitle(batchNo + " Batch Student Report");
            printStudentTable(batchStudents);

            again = askYesNo("\nDo you want to another batch report (Y/N): ");
        }
    }

    // Industry Training Eligibility Report
    public static void industryTrainingEligibilityReport() {
        boolean goHome = false;

        while (!goHome) {
            clearConsole();
            printTitle("Industry Training Eligibility Student Report");

            // count eligible students
            int count = 0;
            for (int i = 0; i < StudentArray.length; i++) {
                Student s = StudentArray[i];
                if (CalculateGPA(s) > 3.25 && s.getprf() > 50 && s.getdbms() > 50) {
                    count++;
                }
            }

           
            Student[] eligible = new Student[count];
            int j = 0;
            for (int i = 0; i < StudentArray.length; i++) {
                Student s = StudentArray[i];
                if (CalculateGPA(s) > 3.25 && s.getprf() > 50 && s.getdbms() > 50) {
                    eligible[j] = s;
                    j++;
                }
            }

            printStudentTable(eligible);

            goHome = askYesNo("\nDo you want to go to the home page (Y/N): ");
        }
    }

    // main method
    public static void main(String args[]) {
        homePage();
    }

}
