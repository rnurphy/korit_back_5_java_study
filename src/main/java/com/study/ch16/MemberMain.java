package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

    private static final ArrayList<Member> members = new ArrayList<>();

    public static String inputSearchName(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label + " >> ");
        return scanner.nextLine();
    }

    public static Member findMemberByName(String name) {
        for (Member member : members) {
            if(member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selectedMenu;

        while (true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.print(">>> ");
            selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else if ("1".equals(selectedMenu)) {
                /*
                * [ 회원 등록하기 ]
                * 이름 >> 김상현
                * 주소 >> 부산 남구
                * << 등록 완료 >>
                * */
                System.out.println("[ 회원 등록하기 ]");
                System.out.print("이름 >> ");
                String name = scanner.nextLine();
                System.out.print("주소 >> ");
                String address = scanner.nextLine();

                Member member = new Member(name, address);
                members.add(member);

                System.out.println("<< 등록 완료 >>");
            } else if ("2".equals(selectedMenu)) {
                /*
                * [ 회원 이름 수정하기 ]
                * 수정할 회원의 이름을 입력하세요 >> 김상현
                * 이름 >> 김상현2
                * << 수정 완료 >>
                * */
                System.out.println("[ 회원 이름 수정하기 ]");
                String modifyName = inputSearchName("수정할 회원의 이름을 입력하세요");
                Member findMember = findMemberByName(modifyName);

                if (findMember == null) {
                    System.out.println("<< 해당 이름의 회원이 존재하지 않습니다 >>");
                    continue;
                }
                System.out.print("이름 >> ");
                String updateName = scanner.nextLine();
                findMember.setName(updateName);
                System.out.println("<< 수정 완료 >>");
            } else if ("3".equals(selectedMenu)) {
                /*
                * [ 회원 주소 수정하기 ]
                * 수정할 회원의 이름을 입력하세요 >> 김상현
                * 주소 >> 부산 수영구
                * << 수정 완료 >>
                * */
                System.out.println("[ 회원 주소 수정하기 ]");
                String modifyName = inputSearchName("수정할 회원의 이름을 입력하세요");
                Member findMember = findMemberByName(modifyName);

                if (findMember == null) {
                    System.out.println("<< 해당 이름의 회원이 존재하지 않습니다 >>");
                    continue;
                }
                System.out.print("주소 >> ");
                String updateAddress = scanner.nextLine();
                findMember.setName(updateAddress);
                System.out.println("<< 수정 완료 >>");
            } else if ("4".equals(selectedMenu)) {
                /*
                * [ 회원 이름으로 조회하기 ]
                * 조회할 회원의 이름을 입력하세요 >> 김상현
                * Member 객체의 toString() 호출
                * << 조회 완료 >>
                * */
                System.out.println("[ 회원 이름으로 조회하기 ]");
                String findName = inputSearchName("조회할 회원의 이름을 입력하세요");

                Member findMember = findMemberByName(findName);

                if (findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                System.out.println(findMember);
                System.out.println("<< 조회 완료 >>");
            } else if ("5".equals(selectedMenu)) {
                /*
                * [ 회원 전체 조회하기 ]
                * MemberList 전체 반복 toString();
                * << 전체 조회 완료 >>
                * */
                System.out.println("[ 회원 전체 조회하기 ]");
                if (members.isEmpty()) {
                    System.out.println("회원이 존재하지 않습니다.");
                    continue;
                }
                for (Member member : members) {
                    System.out.println(member);
                }
                System.out.println("<< 전체 조회 완료 >>");
            } else if ("6".equals(selectedMenu)) {
                /*
                * [ 회원 삭제하기 ]
                * 삭제할 회원의 이름을 입력하세요 >> 김상현
                * 삭제된 Member 객체 toString();
                * << 삭제 완료 >>
                * */
                if (members.isEmpty()) {
                    System.out.println("회원이 한 명도 존재하지 않습니다.");
                    continue;
                }


                System.out.println("[ 회원 삭제하기 ]");
                System.out.print("삭제할 회원의 이름을 입력하세요 >> ");
                
                String removeName = scanner.nextLine();

                Member removeMember = null;
                
                for (Member member : members) {
                    if(member.getName().equals(removeName)) {
                        System.out.println(member);
                        members.remove(member);
                        removeMember = member;
                        System.out.println("<< 삭제 완료 >>");
                        break;
                    }
                }
                if (removeMember == null) {
                    System.out.println("<< 삭제 실패 >>");
                }
            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
