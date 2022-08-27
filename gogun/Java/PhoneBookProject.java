import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class PhoneBookProject {
    static File file = new File("juso.txt");
    public static void main(String[] args) throws IOException {
        ArrayList<PhoneBook> arrayOfJuso = new ArrayList<>();
        try{
            //juso.txt 파일이 기존에 있던 파일이면 그 파일 안의 내용을 읽어서 배열에 추가해줌
            if(!file.createNewFile()) {
                readTxt(arrayOfJuso);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("[Develop Study Project] 60221300 고건");
        System.out.println("[연락처 관리 프로그램]");
        boolean run = true;
        while(run) {
            Scanner sc = new Scanner(System.in);
            int n = 0;
            print_menu();
            try {
            n = sc.nextInt(); }
            catch (InputMismatchException e) {
                //숫자가 아닌 값을 입력하게 되면 오류 메세지 출력
                System.out.println("\n숫자만 입력해주세요.");
                continue;
            }
            switch (n) {
                case 1:
                    //주소록을 보여주기 전에 현재 배열 값에 순차적으로 순번을 입력해 파일에 다시 입력해줌
                    update(arrayOfJuso);
                    view_juso(arrayOfJuso);
                    break;
                case 2:
                    add_juso(sc, arrayOfJuso);
                    break;
                case 3:
                    if (arrayOfJuso.isEmpty()) {
                        //파일에 입력된 값이 없으면 삭제 메뉴로 넘어가지 못하도록 함
                        System.out.println("\n등록된 연락처가 없습니다.");
                        break;
                    }
                    delete_juso(sc, arrayOfJuso);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("\n잘못된 메뉴입니다. 메뉴를 다시 선택하세요.");
            }
        }
    }
    public static void print_menu() {
        System.out.println("\n1. 연락처 출력");
        System.out.println("2. 연락처 등록");
        System.out.println("3. 연락처 삭제");
        System.out.println("4. 끝내기\n");
        System.out.print("메뉴를 선택하세요: ");
    }
    public static void add_juso(Scanner sc, ArrayList<PhoneBook> arrayOfJuso) throws IOException {
        boolean run = true;
        System.out.print("\n이름 입력: ");
        String name = sc.next();
        while (run) {
            System.out.print("나이 입력: ");
            String age = sc.next();
            try {
                int age_int = Integer.parseInt(age);
                age = Integer.toString(age_int);
            } catch (NumberFormatException e) {
                //나이를 숫자로 입력하지 않으면 오류 메세지 출력
                System.out.println("\n나이는 숫자로 입력해주세요.");
                continue;
            }
            System.out.print("번호 입력: ");
            String tel = sc.next();
            arrayOfJuso.add(new PhoneBook(name, age, tel));
            run = false;
        }
        System.out.println("\n" + name + " 연락처가 등록되었습니다.");
        write_juso(arrayOfJuso);
    }
    public static void write_juso(ArrayList<PhoneBook> arrayOfJuso) {
        Writer fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < arrayOfJuso.size(); i++) {
                //연락처게 순번을 매겨줌
                bw.write("[" + (i+1) + "] ");
                bw.write(arrayOfJuso.get(i).getName() + "\t\t" + arrayOfJuso.get(i).getAge() + "\t\t"
                        + arrayOfJuso.get(i).getTel() + "\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void view_juso(ArrayList<PhoneBook> arrayOfJuso) throws IOException {
        try{
            //파일 내용을 읽어주는 BufferReader 생성
            BufferedReader br = new BufferedReader(new FileReader(file));
            if (br.readLine() == null) {
                //파일이 비어있으면 오류 메세지 출력
                System.out.println("\n등록된 연락처가 없습니다.");
            }  else {
                try {
                    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                    FileReader fr = new FileReader("juso.txt");
                    BufferedReader br_f = new BufferedReader(fr);
                    String line="";
                    System.out.println("");
                    //파일의 내용을 읽은 후 한 줄씩 출력
                    for (int i = 1; (line= br_f.readLine()) != null; i++) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void delete_juso(Scanner sc, ArrayList<PhoneBook> arrayOfJuso) {
        boolean run = true;
        String s;
        System.out.println("\n1. 순번 삭제\n2. 이름 삭제\n3. 번호 삭제\n4. 메인 메뉴로 이동\n");
        System.out.print("세부 메뉴를 선택하세요: ");
        while (run) {
            s = sc.next();
            try {
                int n = Integer.parseInt(s);
                switch (n) {
                    case 1: //순번 삭제
                        number_delete(sc, arrayOfJuso);
                        run = false;
                        break;
                    case 2: //이름 삭제
                        name_delete(sc, arrayOfJuso);
                        run = false;
                        break;
                    case 3: //번호 삭제
                        tel_delete(sc, arrayOfJuso);
                        run = false;
                        break;
                    case 4: //메인 메뉴로 이동
                        run = false;
                        break;
                    default:
                        //1~4가 아닌 숫자를 입력했을 때 오류 메세지 출력
                        System.out.print("\n잘못된 세부 메뉴입니다. 세부 메뉴를 다시 선택하세요: ");
                }

            } catch (NumberFormatException e) {
                //숫자를 입력하지 않았을 때 오류 메세지 출력
                System.out.print("\n메뉴는 숫자로 입력해주세요: ");
            }
        }
    }
    public static void number_delete(Scanner sc, ArrayList<PhoneBook> arrayOfJuso) {
        boolean run = true;
        String s;
        System.out.print("\n삭제할 연락처 순번은? ");
        while(run) {
            s = sc.next();
            try {
                int n = Integer.parseInt(s);
                //arrayOfJuso에서 순번을 찾아서 삭제
                //만약 존재하지 않는 순번을 입력하면 오류 메세지 출력
                if (n <= 0 || n > arrayOfJuso.size()) {
                    System.out.println("\n존재하지 않는 순번입니다.");
                } else {
                    System.out.println("\n" + arrayOfJuso.get(n - 1).getName() + " 연락처가 삭제되었습니다.");
                    arrayOfJuso.remove(n - 1);
                    update(arrayOfJuso);
                }
            } catch (NumberFormatException e) {
                //만약 입력받은 s가 숫자가 아니라면 숫자를 입력받으라는 메시지 출력
                System.out.print("\n순번은 숫자로 입력해주세요: ");
                continue;
            }
            run = false;
        }
    }
    public static void name_delete(Scanner sc, ArrayList<PhoneBook> arrayOfJuso) {
        String s;
        System.out.print("삭제할 연락처 이름은? ");
        s = sc.next();
        //arrayOfJuso 중 입력받은 이름을 포함하는 인덱스를 찾아서 삭제
        //만약 존재하지 않는 이름을 입력하면 오류 메세지 출력
        int j = 0;
        for (int i = 0; i < arrayOfJuso.size(); i++) {
            if (arrayOfJuso.get(i).getName().equals(s)) {
                System.out.println("\n" + arrayOfJuso.get(i).getName() + " 연락처가 삭제되었습니다.");
                arrayOfJuso.remove(i);
                update(arrayOfJuso);
                break;
            } else {
                if (i + 1 == arrayOfJuso.size()){
                    //연락처에 포함된 이름이 없을 때 메세지의 다중 출력을 막기 위해
                    //연락처의 마지막 이름을 비교할 때만 오류 메세지 출력
                    System.out.println("\n존재하지 않는 연락처입니다.");
                    break;
                }
            }
        }
    }
    public static void tel_delete(Scanner sc, ArrayList<PhoneBook> arrayOfJuso) {
        String s;
        System.out.print("삭제할 연락처 번호는? ");
        s = sc.next();
        //arrayOfJuso 중 입력받은 전화번호를 포함하는 인덱스를 찾아서 삭제
        //만약 존재하지 않는 전화번호을 입력하면 오류 메세지 출력
        int j = 0;
        for (int i = 0; i < arrayOfJuso.size(); i++) {
            if (arrayOfJuso.get(i).getTel().equals(s)) {
                System.out.println("\n" + arrayOfJuso.get(i).getName() + " 연락처가 삭제되었습니다.");
                arrayOfJuso.remove(i);
                update(arrayOfJuso);
                break;
            } else {
                if (i + 1 == arrayOfJuso.size()){
                    //연락처에 포함된 번호가 없을 때 메세지의 다중 출력을 막기 위해
                    //연락처의 마지막 번호를 비교할 때만 오류 메세지 출력
                    System.out.println("\n존재하지 않는 연락처입니다.");
                    break;
                }
            }
        }
    }
     public static void update(ArrayList<PhoneBook> arrayOfJuso) {
         // 삭제 후 남아있는 연락처를 재정렬해주어야 함.
         // 삭제 후 arraylist를 juso.txt 파일에 다시 입력
         // 입력 하기 전 파일을 싹 비워줘야 함.
         Writer fw = null;
         BufferedWriter bw = null;
         try {
             fw = new FileWriter(file);
             bw = new BufferedWriter(fw);
             for (int i = 0; i < arrayOfJuso.size(); i++) {
                 bw.write("[" + (i+1) + "] ");
                 bw.write(arrayOfJuso.get(i).getName() + "\t\t" + arrayOfJuso.get(i).getAge() + "\t\t"
                 + arrayOfJuso.get(i).getTel() + "\r\n");
             }
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             try {
                 bw.close();
             } catch (Exception e) {
                 e.printStackTrace();
             }
         }
     }
    public static void readTxt(ArrayList<PhoneBook> arrayOfJuso) {
        Reader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = "";
            String[] elements = new String[3];

            while ((line = br.readLine()) != null) {
                elements = line.split("\t\t");
                String[] elements_2 = elements[0].split(" ", 2);
                arrayOfJuso.add(new PhoneBook(elements_2[1], elements[1], elements[2]));
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class PhoneBook {
    String name;
    String age;
    String tel;
    public PhoneBook(String name, String age, String tel) {
        this.name = name;
        this.age = age;
        this.tel = tel;
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getTel() {
        return tel;
    }
}