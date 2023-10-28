package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator{

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(1, 9);
    }
}
