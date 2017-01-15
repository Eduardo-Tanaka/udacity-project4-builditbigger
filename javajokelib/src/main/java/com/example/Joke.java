package com.example;

import java.util.Random;

public class Joke {

    String[] jokeArray = {
        "Doctor: I'm sorry but you suffer from a terminal illness and have only 10 to live.\n\nPatient: What do you mean, 10? 10 what?\n\nMonths? Weeks?!\n\nDoctor: Nine.",
        "I dreamt I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.",
        "A man asks a farmer near a field, “Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.”\n\nThe farmer says, “Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one.”",
        "Two Elephants meet a totally naked guy. After a while one elephant says to the other: “I really don’t get how he can feed himself with that thing!”",
        "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
        "Oh darling, since you’ve started dieting, you’ve become such a passionate kisser…\n\nWhat do you mean, passionate? I’m looking for food remains!",
        "Little Johnny once bought his Grandma a very nice, luxurious toilet brush for her birthday. But when he went to visit her a couple of weeks later, it wasn't in the bathroom.\n\nLittle Johnny asked his Grandma, “Gran, what happened to the toilet brush I gave you?”\n\n“Darling, I'm sorry but I just didn’t like it. It was too scratchy. After all those years, I’ve gotten used to the toilet paper.”",
        "Doctor: Hello, did you come to see me with an eye problem?\n\nPatient: Wow, yes, how can you tell?\n\nDoctor: Because you came in through the window instead of the door.",
        "Police officer: \"Can you identify yourself, sir?\"\n\nDriver pulls out his mirror and says: \"Yes, it's me.\"",
        "My wife’s cooking is so bad we usually pray after our food."
    };

    public String tellJoke(){
        Random random = new Random();

        return jokeArray[random.nextInt(10)];
    }
}
