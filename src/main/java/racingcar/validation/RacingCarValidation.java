package racingcar.validation;

import racingcar.domain.CarList;

public class RacingCarValidation {

    public void checkNameLength(String name){
        if(name.length() > 5)
            throw new IllegalArgumentException("해당 이름은 크키가 5 초과입니다.");
    }

    public void illegalValidation(int count){
        if(count < 1 || count > 10000)
            throw new IllegalArgumentException("해당 값은 범위 내에서 실행할 수 없는 값입니다. (1 ~ 10000)");
    }

}
