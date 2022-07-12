package actor.player_builder.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PlayersGear {

    private String bodyArmorName;
    private int bodyArmorDefLvl;
    private String bootsName;
    private int bootsDefLvl;
    private int rightHandDamage;
    private int leftHandDamage;
    private int bothHandDamage;

}
