package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application4 {

    public static void main(String[] args) {

        // 객체 단위로 입출력을 하기 위한 ObjectInputStream/ObjectOutputSteam 확인
        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍길동", "hong345@ohgiraffers.com", 25, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "korea123@ohgiraffers.com", 16, '여', 1750.7),
                new MemberDTO("user03", "pass03", "이순신", "leesoonsin123@ohgiraffers.com", 35, '남', 3250.7)
        };

        ObjectOutputStream objOut = null;

        try {
            objOut = new ObjectOutputStream
                    (new BufferedOutputStream
                            (new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt")));

            boolean exists = new File("src/main/java/com/ohgiraffers/section03/filterstream/testObjStream.txt").exists();
            System.out.println("exists = " + exists);

            for (int i = 0; i < outputMembers.length; i++) {
                objOut.writeObject(outputMembers[i]);
            }
            objOut.flush(); // 내용 내보내기

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("==================================");

        MemberDTO[] inputMembers = new MemberDTO[3];
    }
}
