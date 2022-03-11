# aop-part6-chapter01 - 배달앱 클론하기

![배달앱 클론](https://imgur.com/84dhJEN.jpg)

---

## 아키텍쳐
![아키텍쳐 비교](https://imgur.com/D6hcdF5.jpg)

## 목차

1. 메인화면 > 홈탭(식당 리스트)
2. 위치 변경 화면
3. 정렬 기능 > 별점 높은 순
4. 식당 상세화면
5. 찜 버튼 클릭
6. 스크롤 시 툴바 제목 애니메이션
7. 식당 상세화면 > 전화
8. 찜 탭
9. 식당 상세화면 > 공유
10. 식당 상세화면 > 메뉴리스트
11. 식당 상세화면 > 장바구니 추가
12. 장바구니 추가 > 홈화면에 반영 된 장바구니 버튼
13. 다른 식당 상세화면 > 장바구니 담을 때 기존 비우기
14. 장바구니 버튼 클릭 > 주문 확인 리스트
15. 주문 취소 > 장바구니 비우고 화면 종료
16. 장바구니 담기 > 로그인 되어 있지 않으면 프로필 탭 이동
17. My탭 - 로그인 필요
18. My탭 - 프로필 정보 불러오기
19. 리뷰 글 쓰기 화면
20. 사진 첨부 선택
21. 사진 첨부 선택 > 갤러리
22. 사진 첨부 > 카메라 사진 촬영
23. 카메라 > 사진 미리보기
24. 리뷰 글 쓰기 화면 - 사진 첨부 후
25. 리뷰 글 쓰기 화면 - 글 업로드 중
26. 식당 상세 > 리뷰 리스트 화면

## 결과 화면

| 1. 메인화면 > 홈탭(식당 리스트)                              | 2. 위치 변경 화면                                   | 3. 정렬 기능 > 별점 높은 순                                  |
| ------------------------------------------------------------ | --------------------------------------------------- | ------------------------------------------------------------ |
| ![1. 메인화면 > 홈탭(식당 리스트)](https://imgur.com/kOerohP.jpg) | ![2. 위치 변경 화면](https://imgur.com/nZL10YU.jpg) | ![3. 정렬 기능 > 별점 높은 순](https://imgur.com/CdY6GZi.jpg) |

| 4. 식당 상세화면                                    | 5. 찜 버튼 클릭                                   | 6. 스크롤 시 툴바 제목 애니메이션                            |
| --------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------------------ |
| ![4. 식당 상세화면)](https://imgur.com/HHjxh6p.jpg) | ![5. 찜 버튼 클릭](https://imgur.com/iBEZZ5f.jpg) | ![6. 스크롤 시 툴바 제목 애니메이션](https://imgur.com/W2dDZKn.jpg) |

| 7. 식당 상세화면 > 전화                                    | 8. 찜 탭                                   | 9. 식당 상세화면 > 공유                                   |
| ---------------------------------------------------------- | ------------------------------------------ | --------------------------------------------------------- |
| ![7. 식당 상세화면 > 전화)](https://imgur.com/UO4ql3D.jpg) | ![8. 찜 탭](https://imgur.com/fJ80DKh.jpg) | ![9. 식당 상세화면 > 공유](https://imgur.com/YszqT0a.jpg) |

| 10. 식당 상세화면 > 메뉴리스트                               | 11. 식당 상세화면 > 장바구니 추가                            | 12. 장바구니 추가 > 홈화면에 반영 된 장바구니 버튼           |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![10. 식당 상세화면 > 메뉴리스트)](https://imgur.com/CyZlTuw.jpg) | ![11. 식당 상세화면 > 장바구니 추가](https://imgur.com/liONTj8.jpg) | ![12. 장바구니 추가 > 홈화면에 반영 된 장바구니 버튼](https://imgur.com/JHBtWLg.jpg) |

| 13. 다른 식당 상세화면 > 장바구니 담을 때 기존 비우기        | 14. 장바구니 버튼 클릭 > 주문 확인 리스트                    | 15. 주문 취소 > 장바구니 비우고 화면 종료                    |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![13. 다른 식당 상세화면 > 장바구니 담을 때 기존 비우기)](https://imgur.com/KDJKhwt.jpg) | ![14. 장바구니 버튼 클릭 > 주문 확인 리스트](https://imgur.com/mdffSff.jpg) | ![15. 주문 취소 > 장바구니 비우고 화면 종료](https://imgur.com/WISBtMr.jpg) |

| 16. 장바구니 담기 > 로그인 되어 있지 않으면 프로필 탭 이동   | 17. My탭 - 로그인 필요                                   | 18. My탭 - 프로필 정보 불러오기                          |
| ------------------------------------------------------------ | -------------------------------------------------------- | -------------------------------------------------------- |
| ![16. 장바구니 담기 > 로그인 되어 있지 않으면 프로필 탭 이동](https://imgur.com/4nuTEBh.jpg) | ![17. My탭 - 로그인 필요](https://imgur.com/WISBtMr.jpg) | ![17. My탭 - 로그인 필요](https://imgur.com/MtLBgnH.jpg) |

| 19. 리뷰 글 쓰기 화면                                   | 20. 사진 첨부 선택                                   | 21. 사진 첨부 선택 > 갤러리                                  |
| ------------------------------------------------------- | ---------------------------------------------------- | ------------------------------------------------------------ |
| ![19. 리뷰 글 쓰기 화면](https://imgur.com/u0W5UGm.jpg) | ![20. 사진 첨부 선택](https://imgur.com/JNJcKAA.jpg) | ![21. 사진 첨부 선택 > 갤러리](https://imgur.com/YKutPKz.jpg) |

| 22. 사진 첨부 > 카메라 사진 촬영                             | 23. 카메라 > 사진 미리보기                                   | 24. 리뷰 글 쓰기 화면 - 사진 첨부 후                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![22. 사진 첨부 > 카메라 사진 촬영](https://imgur.com/BHfBSWv.jpg) | ![23. 카메라 > 사진 미리보기](https://imgur.com/iQtSF8Q.jpg) | ![24. 리뷰 글 쓰기 화면 - 사진 첨부 후](https://imgur.com/owoeVCC.jpg) |

| 25. 리뷰 글 쓰기 화면 - 글 업로드 중                         | 26. 식당 상세 > 리뷰 리스트 화면                             |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![25. 리뷰 글 쓰기 화면 - 글 업로드 중](https://imgur.com/uJghbnQ.jpg) | ![26. 식당 상세 > 리뷰 리스트 화면](https://imgur.com/DzBWttG.jpg) |

