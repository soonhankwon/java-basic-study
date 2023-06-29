package com.soon.inheritance;

public class Ari extends Champion{

    public Ari(String name) {
        super(name);
        System.out.println("Ari.Ari");
    }

    public void accessUpperClassSkillQ() {
        super.defaultSkillQ();
    }

    @Override
    void defaultSkillQ() {
        System.out.println("KDA ARI DEFAULT SKILL Q");
    }

    void defaultSkillE() {
        System.out.println("KDA ARI DEFAULT SKILL E");
    }

    public void ariSkillQQ() {
        System.out.println("ARI SKILL QQ");
    }

    public static void main(String[] args) {
        Ari kdaAri = new Ari("KDA ARI");
        kdaAri.accessUpperClassSkillQ();
        kdaAri.defaultSkillQ();
        kdaAri.ariSkillQQ();

        // upcasting -> 부모 타입으로 캐스팅하지만, new object 주소를 참조한다.
        Champion kdaAri2 = new Ari("KDA ARI");
        Champion champion = new Champion("DEFAULT CHAMPION");
        System.out.println(kdaAri2);
        /*
         * 컴파일 시점에는 Champion 클래스의 멤버변수, 메서드만 접근가능하지만
         * 실제로는 Ari 객체를 참조하고 있음으로 오버라이드된 메서드가 실행된다.
         */

        kdaAri2.defaultSkillQ(); //Ari Object 참조 -> Ari 의 method address
        kdaAri2.defaultSkillE();
        champion.defaultSkillQ(); //champion 의 method address
//        kdaAri2.accessUpperClass(); no!
    }
}


