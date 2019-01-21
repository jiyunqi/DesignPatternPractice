package jyq.factory;

public class HairFactory {

    public HairInterface getHair(String key){
        if("left".equals(key)) {
            return new LeftHair();
        }else if("right".equals(key)){
            return new RightHair();
        }else{
            return null;
        }
    }

    public HairInterface getHairByClass(Class<?> clazz){
        try {
            HairInterface hair = (HairInterface)Class.forName(clazz.getName()).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
