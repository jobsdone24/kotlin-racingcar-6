package racingcar

import camp.nextstep.edu.missionutils.Console
fun main() {

    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    val nameInput = Console.readLine()
    val carList = nameInput.split(",");
    val carlistSize = carList.size
    for( i in 0..carlistSize){
        if(carList[i].length>5){
            throw IllegalArgumentException("5자 이상 입력")
            return
        }
    }

    val carInfo = Array<Car?>(carlistSize){null}
    for(i in 0..carlistSize-1){
        carInfo[i] = Car(carList[i])
    }

    println("시도할 횟수는 몇 회인가요?")
    val playTime = Console.readLine().toInt()
}
