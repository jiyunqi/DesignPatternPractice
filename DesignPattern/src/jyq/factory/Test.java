package jyq.factory;

public class Test {
    public static void main(String[] args) {
       /* HairInterface left = new LeftHair();
        left.draw();

        HairInterface right = new RightHair();
        right.draw();*/

        /*HairFactory factory = new HairFactory();
        HairInterface left = factory.getHair("left");
        left.draw();*/

        HairFactory hairFactory = new HairFactory();
        HairInterface hairInterface = null;
        hairInterface = hairFactory.getHairByClass(RightHair.class);
        hairInterface.draw();
        hairInterface = hairFactory.getHairByClass(LeftHair.class);
        hairInterface.draw();
    }
}


