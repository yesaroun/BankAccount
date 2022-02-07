package temp0207;
/*==========================================================
    ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
============================================================*/

// Test165클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)
    [메뉴 선택]
    1. 요소 추가
    2. 요소 출력
    3. 요소 검색
    4. 요소 삭제
    5. 요소 변경
    6. 종료
    >> 메뉴 선택(1~6) : 1

    1번째 요소 입력 : 박현수
    1번째 요소 입력 성공~!!!
    요소 입력 계속(Y/N)? : y

    2번째 요소 입력 : 오이상
    2번째 요소 입력 성공~!!!
    요소 입력 계속(Y/N)? : N

    [메뉴 선택]
    1. 요소 추가
    2. 요소 출력
    3. 요소 검색
    4. 요소 삭제
    5. 요소 변경
    6. 종료
    >> 메뉴 선택(1~6) : 2

    [벡터 전체 출력]
        박현수
        오이삭
    벡터 전체 출력 완료~!!!

    [메뉴 선택]
    1. 요소 추가
    2. 요소 출력
    3. 요소 검색
    4. 요소 삭제
    5. 요소 변경
    6. 종료
    >> 메뉴 선택(1~6) : 3

    검색할 요소 입력 : 오이삭

    [검색 결과 출력]
    항목이 존재합니다.

    [메뉴 선택]
    1. 요소 추가
    2. 요소 출력
    3. 요소 검색
    4. 요소 삭제
    5. 요소 변경
    6. 종료
    >> 메뉴 선택(1~6) : 3

    검색할 요소 입력 : 임소민

    [검색 결과 출력]
    항목이 존재하지 않습니다.

    [메뉴 선택]
    1. 요소 추가
    2. 요소 출력
    3. 요소 검색
    4. 요소 삭제
    5. 요소 변경
    6. 종료
    >> 메뉴 선택(1~6) : 4

    삭제할 요소 입력 : 홍은혜

    [삭제 결과 출력]
    항목이 존재하지 않아 삭제할 수 없습니다.

    [메뉴 선택]
    1. 요소 추가
    2. 요소 출력
    3. 요소 검색
    4. 요소 삭제
    5. 요소 변경
    6. 종료
    >> 메뉴 선택(1~6) : 4

    삭제할 요소 입력 : 박현수

    [삭제 결과 출력]
    박현수 항목이 삭제되었습니다.

    [메뉴 선택]
    1. 요소 추가
    2. 요소 출력
    3. 요소 검색
    4. 요소 삭제
    5. 요소 변경
    6. 종료
    >> 메뉴 선택(1~6) : 5

    변경할 요소 입력 : 김민성

    [변경 결과 출력]
    변경할 대상이 존재하지 않습니다.

    [메뉴 선택]
    1. 요소 추가
    2. 요소 출력
    3. 요소 검색
    4. 요소 삭제
    5. 요소 변경
    6. 종료
    >> 메뉴 선택(1~6) : 5

    변경할 요소 입력 : 오이삭
    수정할 내용 입력 : 정은정

    [변경 결과 출력]
    변경이 완료되었습니다.

    [메뉴 선택]
    1. 요소 추가
    2. 요소 출력
    3. 요소 검색
    4. 요소 삭제
    5. 요소 변경
    6. 종료
    >> 메뉴 선택(1~6) : 2

    [벡터 전체 출력]
        정은정
    벡터 전체 출력 완료~!!!

    [메뉴 선택]
    1. 요소 추가
    2. 요소 출력
    3. 요소 검색
    4. 요소 삭제
    5. 요소 변경
    6. 종료
    >> 메뉴 선택(1~6) : 6

    프로그램 종료
    계속하려면 아무 키나...
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

class Menus         //-- 완성
{
    public static final int E_ADD = 1;          //-- 요소 추가
    public static final int E_DISP = 2;         //-- 요수 출력
    public static final int E_FIND = 3;         //-- 요소 검색
    public static final int E_DEL = 4;          //-- 요소 삭제
    public static final int E_CHA = 5;          //-- 요소 변경
    public static final int E_EXIT = 6;         //-- 종료
}

public class Test165
{
    // 주요 속성 구성 → 완성
    private static final Vector<Object> vt;     //-- 자료구조
    private static BufferedReader br;           //-- 입력시 활용
    private static Integer sel;                 //-- 선택값
    private static String con;                  //-- 계속 여부

    // static 초기화 블럭
    static
    {
        // Vector 자료구조 생성
        vt = new Vector<Object>();

        //BufferedReader 클래스 인스턴스 생성
        br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자 입력값 초기화
        sel = 1;
        con = "Y";
    }

    // 메뉴 출력 메소드
    public static void menuDisp()
    {
        System.out.println("\n\t[메뉴 선택]");
        System.out.println("1. 요소 추가");
        System.out.println("2. 요소 출력");
        System.out.println("3. 요소 검색");
        System.out.println("4. 요소 삭제");
        System.out.println("5. 요소 변경");
        System.out.println("6. 종료");
    }

    // 메뉴 선택 메소드
    public static void menuSelect() throws IOException, NumberFormatException
    {
        System.out.print(">> 메뉴 선택(1~6) : ");
        sel = Integer.parseInt(br.readLine());
    }

    // 선택된 메뉴 실행에 따른 기능 호출 메소드
    public static void menuRun() throws IOException
    {
        switch (sel)
        {
            case Menus.E_ADD: addElement(); break;
            case Menus.E_DISP: dispElement(); break;
            case Menus.E_FIND: findElement(); break;
            case Menus.E_DEL: delElement(); break;
            case Menus.E_CHA: chaElement(); break;
            case Menus.E_EXIT: exit(); break;
        }
    }

    // 자료구조에 요소 추가(입력) 메소드
    public static void addElement() throws IOException
    {
        int num = 0;
        do
        {
            num++;
            System.out.printf("\n%d번째 요소 입력 : ", num);
            vt.add(br.readLine());
            System.out.printf("%d번째 요소 입력 성공~!\n", num);
            System.out.print("요소 입력 계속(Y/N)? : ");
            con = br.readLine();
        }
        while (con.equals("Y") || con.equals("y"));
    }

    // 자료구조 전체 요소 출력 메소드
    public static void dispElement()
    {
        System.out.println("\t[벡터 전체 출력]");
        for (Object str : vt)
            System.out.println(str);
        System.out.println("벡터 전체 출력 완료~!!!");
    }

    // 자료구조 내 요소 검색 메소드
    public static void findElement() throws IOException
    {
        System.out.print("\n검색할 요소 입력 : ");
        String sSearch = br.readLine();
        int tempCheckNum = vt.indexOf(sSearch);

        if(tempCheckNum < 0)
        {
            System.out.println("\n\t[검색 결과 출력]");
            System.out.println("항목이 존재하지 않습니다.");
        }
        else
        {
            System.out.println("\t[검색 결과 출력]");
            System.out.println("항목이 존재합니다.");
        }
    }

    // 자료구조 내 요소 삭제 메소드
    public static void delElement() throws IOException
    {
        System.out.print("\n삭제할 요소 입력 : ");
        String sDel = br.readLine();
        int tempCheckNum = vt.indexOf(sDel);

        if(tempCheckNum<0)
        {
            System.out.println("\t[삭제 결과 출력]");
            System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
        }
        else
        {
            vt.remove(tempCheckNum);
            System.out.println("\t[삭제 결과 출력]");
            System.out.printf("%s 항목이 삭제되었습니다.\n", sDel);
        }
    }

    // 자료구조 내 요소 수정(변경) 메소드
    public static void chaElement() throws IOException
    {
        System.out.print("\n변경할 요소 입력 : ");
        String sChange = br.readLine();
        int tempCheckNum = vt.indexOf(sChange);
        if(tempCheckNum<0)
        {
            System.out.println("\t[변경 결과 출력]");
            System.out.println("변경할 대상이 존재하지 않습니다.");
        }
        else
        {
            vt.remove(tempCheckNum);
            System.out.print("변경할 요소 입력 : ");
            String sAfter = br.readLine();
            if(vt.size()==0)
            {
                vt.add(tempCheckNum);
                vt.remove(tempCheckNum);
            }
            else
            {
                vt.remove(tempCheckNum);
                vt.add(tempCheckNum, sAfter);
            }
            System.out.println("\t[변경 결과 출력]");
            System.out.println("변경이 완료되었습니다.");
        }
    }

    // 프로그램 종료 메소드 ➢ 완성
    public static void exit()
    {
        System.out.println("\n\t프로그램 종료~!!!");
        System.exit(-1);
    }


    // main() 메소드 → 완성
    public static void main(String[] args) throws IOException, NumberFormatException, IOException {
        do
        {
            menuDisp();
            menuSelect();
            menuRun();
        }
        while (true);
    }
}
// 160 56줄

/*  //참고
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.IOException;
        import java.util.Vector;

class Menus
{
    public static final int E_ADD = 1;   //-- 요소 추가
    public static final int E_DISP = 2;  //-- 요소 출력
    public static final int E_FIND = 3;  //-- 요소 검색
    public static final int E_DEL = 4;   //-- 요소 삭제
    public static final int E_CHA = 5;   //-- 요소 변경
    public static final int E_EXIT = 6;  //-- 종료
}

public class Test165
{

    // 주요 속성 구성 → 완성
    private static final Vector<Object> vt;   //-- 자료구조
    private static BufferedReader br;         //-- 입력 시 활용
    private static Integer sel;               //-- 선택 값
    private static String con;                //-- 계속 여부

    // static 초기화 블럭
    static
    {
        // Vector 자료구조 생성
        vt = new Vector<Object>();

        // BufferedReader 클래스 인스턴스 생성
        br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자 입력값 초기화
        sel = 1;
        con = "Y";
    }

    // 메뉴 출력 메소드
    public static void menuDisp()
    {
        System.out.println("\n[메뉴 선택]");
        System.out.println("1. 요소 추가");
        System.out.println("2. 요소 출력");
        System.out.println("3. 요소 검색");
        System.out.println("4. 요소 삭제");
        System.out.println("5. 요소 변경");
        System.out.println("6. 종료");
    }

    // 메뉴 선택 메소드
    public static void menuSelect() throws IOException, NumberFormatException
    {
        System.out.print(">> 메뉴 선택 (1~6) : ");
        sel = Integer.parseInt(br.readLine());
        System.out.println();
    }

    // 선택된 메뉴 실행에 따른 기능 호출 메소드
    public static void menuRun() throws IOException
    {
        switch (sel)
        {
            case Menus.E_ADD: addElement(); break;
            case Menus.E_DISP: dispElement(); break;
            case Menus.E_FIND: findElement(); break;
            case Menus.E_DEL: delElement(); break;
            case Menus.E_CHA: chaElement(); break;
            case Menus.E_EXIT: exit();
            default: System.out.println("1~6 사이의 숫자를 입력해주세요.");
        }
    }

    // 자료구조에 요소 추가(입력) 메소드
    public static void addElement() throws IOException
    {
        do
        {
            System.out.printf("%d번째 요소 입력 : ", (vt.size()+1));
            String ele = br.readLine();
            vt.add(ele);
            System.out.printf("%d번째 요소 입력 성공 ~!!!\n", vt.size());
            System.out.print("요소 입력 계속 (Y/N)? : ");
            con = br.readLine();
        }
        while (con.equals("Y")|| con.equals("y"));   // 문자열 비교는 equals() 사용 !!!
    }

    // 자료구조 전체 요소 출력 메소드
    public static void dispElement()
    {
        System.out.println("[벡터 전체 출력]");
        for(Object obj : vt)
            System.out.println((String)obj);
        System.out.println("벡터 전체 출력 완료 ~!!!");
    }

    // 자료구조 내 요소 검색 메소드
    public static void findElement() throws IOException
    {
        System.out.print("검색할 요소 입력 : ");
        String search = br.readLine();
        System.out.println("\n[검색 결과 출력]");
        if(vt.contains(search))
            System.out.println("항목이 존재합니다.");
        else
            System.out.println("항목이 존재하지 않습니다.");
    }

    // 자료구조 내 요소 삭제 메소드
    public static void delElement() throws IOException
    {
        System.out.print("삭제할 요소 입력 : ");
        String del = br.readLine();
        System.out.println("\n[삭제 결과 출력]");
        if(vt.contains(del))
        {
            vt.remove(del);
            System.out.println(del + " 항목이 삭제되었습니다.");
        }

        else
            System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
    }

    // 자료구조 내 요소 수정(변경) 메소드
    public static void chaElement() throws IOException
    {
        System.out.print("변경할 요소 입력 : ");
        String cha = br.readLine();
        if(vt.contains(cha))
        {
            System.out.print("수정할 내용 입력 : ");
            String newE = br.readLine();
            vt.set(vt.indexOf(cha), newE);
            System.out.println("\n[변경 결과 출력]");
            System.out.println("변경이 완료되었습니다.");
        }
        else
        {
            System.out.println("\n[변경 결과 출력]");
            System.out.println("변경할 대상이 존재하지 않습니다.");
        }
    }

    // 프로그램 종료 메소드
    public static void exit()
    {
        System.out.println("\n\t프로그램 종료~!!!");
        System.exit(-1);
    }

    // main() 메소드 → 완성
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        do
        {
            menuDisp();
            menuSelect();
            menuRun();
        }
        while (true);
    }
}
 */