package item;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Getter
public class Item {

    //TODO Figure out how to utilize JSON to create items for the game.
    private final int id;
    private final int price;
    private final String name;
}
