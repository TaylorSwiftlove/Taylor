# 의사코드 ==  사람의 언어로 프로그래밍 언어를 표현한 것입니다
# x=10
# 변수 x에 10 할당
x = 10
if x == 10 :
    print("10 입니다.")

x+=1

if x == 11 :
    pass    # if조건문 코드생략
    #pass만 넣고 나중에 할 일은 주석으로 남겨놓는 방식입니다.
    # ex) TODO : x가 11일 때 처리가 필요.

    # TODO, FIXME, BUG, NOTE - 보통 주석에 넣고 검색해서 찾을수 있음. 

x = 10
 
if x == 10:
    print('x에 들어있는 숫자는')
    print('10입니다.')     # unexpected indent 에러 발생
    # 들여쓰기 잘해야됨 들여쓰기 말고 엔터도 되는데 수 맞춰야됨.

if x == 10 : 
  print("엔터도 됨")
  print("띄어쓰기 수 맞춰야됨")


#if 중첩문
x = 15
if x >= 10 :
    print("x")
    if x == 15 :
        print("15 입니다.")
    if x == 10 :
        print("10 입니다.")
x = int(input())    #input을 사용하여 사용자가 입력한 값을 변수에 저장
if x==1 :
    print("x에 1이 입력되었습니다.")

x = int(input()) 
y = input() # 문자열 입력 할때 

if x == 27000 :
    if y == 'Cash3000' :
        x -= 3000
        print(x)
    
    if y == 'Cash5000' :
        x-= 5000
        print(x)

x = 5
if x == 10 :
    print('10 입니다.')
else :
    print('10 아님')

# 변수에 값 할당을 if, else 로 축약
x = 5
if x == 10 :
    y = x
else :
    y = 0

#bool,, 10, 6, 2진수, 실수, 문자열 if 동작 가능
if not 0:
    print('참')    # not 0은 참
 
if not None:
    print('참')    # None은 참
 
if not '':
    print('참')    # not 빈 문자열은 참
# None, False, 0, 비어이쓴 문자열 리스트 튜플 딕셔너리 세트
# 클래스 인스턴스의 __bool__(), __len__() 메서드가 0 또는 False를 반환할 때

x, y, z, k = map(int, input().split()) #정수형으로 변경후 두개 이상 변수에 입력 값 저장.

p=(x+y+z+k)/4
if 0<=x<=100 and 0<=y<=100 and 0<=z<=100 and 0<=k<=100 :
    if p>=80 :
        print("합격")
    else :
        print("불합격")

# elif==elseif elif는 else가 꼭 없어도 됨.
button = int(input())
 
if button == 1:
    print('콜라')
elif button == 2:
    print('사이다')
elif button == 3:
    print('환타')
else:
    print('제공하지 않는 메뉴')

#교통카드
age = int(input())
balance = 9000    # 교통카드 잔액
if 7<=age<=12:
    balance-=650
elif 13<=age<=18 :
    balance-=1050
elif 19<=age :
    balance-=1250
print(balance)