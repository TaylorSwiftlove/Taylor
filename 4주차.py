for i in range(100) :   # i : 루프인덱스 100번 print 실행
    print("귤먹고 토했어요ㅠㅠㅠㅠ")

i = 0
while i < 100 :
    print("왜 귤만 먹으면 속이 메스꺼울까?")
    i+=1

import random   # random 모듈 가져옴

random.random() # 난수생성
random.randint(1, 6)    # 1~6 중 하나 무작위 생성

i = 0
while i !=3 :
    i = random.randint(1, 6)
    print(i)

dice = [1, 2, 3, 4, 5, 6]
random.choice(dice) # 시퀀스객체 요소 중 하나 무작위 생성

while True : # 무한루프 true로 취급하는 거 전부 가능 ex) 1, '문자열' 등
    print("배아프다.")
    break   # 반복문 끝내기

i = 0
for i in range(10) :
    if i % 2 == 0 :
        continue    # 일부코드 실행하지 않고 건너띄기
    print(i)
    i+=1

while True :
    pass    # 반복문에서 아무일도 일어나지 않고 반복문 형태만 유지, 나중에 작성할 코드 표시, 이것과 주석 남겨놓음
    break   # 그냥 pass만 있으면 무한반복 되므로 break 해줌

#입력한 숫자 횟수까지 출력
count = int(input("반복할 횟수 입력하세요: "))
i = 0
while True :
    print("저벅저벅")
    i+=1
    if count == i :
        break

# 입력한 숫자까지 홀수 출력
count = int(input("숫자를 입력하세요 : "))

for i in range(count + 1) : # count 값도 반복되게 하기 위해 +1
    if i % 2 == 0 :
        continue
    print(i)

# 중첩루프
for i in range(5) :
    for j in range(i) :
        print('*', end = '')
    print('\n')

# 계단식 별 그리기
for i in range(5) :
    for i in range(i+1) :
        print('*', end ='')
    print()

for i in range(5) :
    for i in range(5) :
        if j <= i :
            print('*', end ='')
    print()

#fizzbuzz 3의배수 == fizz 5의 배수 == buzz 공배수 == fizzbuzz
for i in range(1, 101):
    print('Fizz' * (i % 3 == 0) + 'Buzz' * (i % 5 == 0) or i)
    # 문자열 곱셈과 덧셈을 이용하여 print 안에서 처리

#터틀그래픽스

import turtle as t
t.shape('turtle')
t.fd(100)
t.rt(90)
t.fd(100)
t.rt(90)
t.fd(100)
t.rt(90)
t.fd(100)
# 터틀창이 꺼진다 -> t.mainloop() = 터틀창이 종료될때까지 마우스 키보드 입력 대기


