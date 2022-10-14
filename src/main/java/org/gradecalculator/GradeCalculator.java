package org.gradecalculator;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

//    private final List<Course> courses;

//    public GradeCalculator(List<Course> courses) {
    public GradeCalculator(List<Course>courses) {
        this.courses = new Courses(courses);
    }

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    /**
     * • 요구사항
     * • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계 / 수강신청 총 학점 수
     * • MVC패턴(Model-View-Controller) 기반으로 구현한다.
     * • 일급 컬렉션 사용
     */

    /**
     * 핵심포인트
     */
    // 이수한 과목을 전달하여 평균학점 계산 요청 --> 학점계산기 --> (학점수 * 교과목 평점)의 합계 --> 과목(코스) 일급 컬렉션
    //                                                  --> 수강신청 총 학점 수          --> 과목(코스) 일급 컬렉션
    public double calculateGrade() {
        // (학점수×교과목 평점)의 합계
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
//        double multipliedCreditAndCourseGrade = 0;
//        for (Course course : courses) {
////            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }

        // 수강신청 총 학점 수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();
//        int totalCompletedCredit = courses.stream()
//                .mapToInt(Course::getCredit)
//                .sum();

        System.out.println(totalMultipliedCreditAndCourseGrade / totalCompletedCredit);

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
//        return multipliedCreditAndCourseGrade / totalCompletedCredit;
//        return 4.5;
    }

}
