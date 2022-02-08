package temp0207;

/*==========================================================
    ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
============================================================*/

// Set -> HashSet, TreeSet
// - 순서 없음.
// - 중복을 허용하지 않는 구조(기본)

/*
0 TreeSet<E> 클래스

    java.util.TreeSet<E> 클래스는
    Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
    데이터를 추가하면 데이터들이 자동으로 오름차순 정렬된다.
 */

// VO       -> Value Object
// DTO      -> Data Transfer Object
// DAO      -> Data Access Object

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class GradeVO
{
    // 주요 속성 구성
    private String hak;         //-- 학번
    private String name;        //-- 이름
    private int kor, eng, mat;  //-- 국어, 영어, 수학점수

    // 생성자(사용자 정의 생성자 -> 5개의 매개변수를 가진생성자)
    GradeVO(String hak, String name, int kor, int eng, int mat)
    {
        this.hak = hak;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    // 생성자(사용자 정의 생성장 -> 매개변수 없는 생성자)
    //-- 매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성하였기 때문에
    //   default 생성자가 자동으로 삽입되지 않을 것을 우려하여
    //   추가로 정의한 생성자
    GradeVO()
    {}

    // getter / setter 구성
    public String getHak()
    {
        return hak;
    }

    public void setHak(String hak)
    {
        this.hak = hak;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getKor()
    {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat()
    {
        return mat;
    }

    public void setMat(int mat)
    {
        this.mat = mat;
    }

    // 추가 메소드 정의(총점 산출)
    public int getTot()
    {
        return kor + eng + mat;
    }
}

// 제네릭 표현식 공부한거 참고하기(찾아보기)  Test156
class MyComparator<T> implements Comparator<T>
{
    // 비교 메소드 재정의
    @Override
    public int compare(T o1, T o2)
    {
        GradeVO s1 = (GradeVO)o1;
        GradeVO s2 = (GradeVO)o2;

        // 학번 기준(오름차순)
        return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());       // 앞이 더 작다는거를 확인할 정도로 넘겨줬다
    }
}


public class Test171 {
    public static void main(String[] args)
    {
        // TreeSet 자료구조 인스턴스 생성
        TreeSet<String> set = new TreeSet<String>();

        // TreeSet 자료구조 set에 요소 추가 -> add();
        set.add("슬램덩크");
        set.add("하울의움직이는성");
        set.add("하이큐");
        set.add("토이스토리");
        set.add("알라딘");
        set.add("코코");
        set.add("심슨");
        set.add("스파이더맨");
        set.add("어드벤쳐타임");
        set.add("짱구는못말려요");
        set.add("포캣몬스터");
        set.add("원피스");

        // Iterator 를 활용한 set 요소 전체 출력
        Iterator<String> it = set.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        //--==>> 스파이더맨 슬램덩크 심슨 알라딘 어드벤쳐타임 원피스 짱구는못말려요 코코 토이스토리 포캣몬스터 하울의움직이는성 하이큐

        // TreeSet 자료구조 인스턴스 생성
        //TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
        TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());      // 우리가 정렬한 비교규칙이 포함되었다

        set2.add(new GradeVO("2201123", "김민성", 90, 80, 70));
        set2.add(new GradeVO("2201124", "박현지", 91, 81, 71));
        set2.add(new GradeVO("2201125", "이윤태", 98, 79, 77));
        set2.add(new GradeVO("2201141", "정은정", 96, 86, 76));
        set2.add(new GradeVO("2201135", "김상기", 99, 82, 72));

        // Iterator 를 활용한 set 요소 전체 출력
        Iterator<GradeVO> it2 = set2.iterator();
        while (it2.hasNext())
        {
            System.out.print(it2.next() + " ");
        }
        System.out.println();
        
       //--==>> 에러 발생(런타임 에러)
        //       Exception in thread "main" java.lang.ClassCastException:
        //       class temp0207.GradeVO cannot be cast to class java.lang.Comparable




    }
}
