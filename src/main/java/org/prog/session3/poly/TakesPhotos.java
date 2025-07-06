package org.prog.session3.poly;

public class TakesPhotos {

    public static void main(String[] args){
        APhone phone = new APhone();
        IPhone phone2 = new IPhone();

        phone.takesPhoto();
        phone2.takesPhoto();
        System.out.println(phone + " takes photos better than " + phone2);
        System.out.println(phone2 + " takes good photos such us " + phone);
    }
}


