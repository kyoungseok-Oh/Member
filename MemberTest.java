public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "홍길동";
        m.age = 30;
        m.tel = "000-1111-1111";
        m.email = "Ic@naver.com";
        m.addr = "서울";
        m.weight = 57.6F;
        System.out.println(m.name+"\t"+m.age+"\t"+m.email+"\t"+m.addr+"\t"+m.weight);
    }
}
