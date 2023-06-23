package com.example.pizzadeliverypet.data.models

import com.example.pizzadeliverypet.R

object database_seed {
    var standardPositionBurger = mutableListOf<Dish>(
        Dish(
            1,
            R.drawable.max_burg_pack,
            "Max Burger Pack",
            "A mouthwatering combination of juicy beef patty, crispy bacon, fresh lettuce, tomatoes, cheese, and special sauce, served in a toasted bun. Comes with a side of golden fries and a refreshing drink.",
            "15 minutes",
            "$12.99",
            "300g"
        ),
        Dish(
            2,
            R.drawable.kids_burg,
            "Kids Burger",
            "A mini-sized burger that kids will love! It features a small beef patty, cheese, lettuce, and ketchup, all tucked inside a soft bun. Served with a side of fries and a choice of drink.",
            "10 minutes",
            "$6.99",
            "150g"
        ),
        Dish(
            3,
            R.drawable.chicken_burg,
            "Chicken Burger",
            "Delicious grilled chicken breast, topped with fresh lettuce, tomatoes, onions, and mayo, all nestled in a soft bun. Served with a side of crispy fries.",
            "12 minutes",
            "$9.99",
            "250g"
        ),
        Dish(
            4,
            R.drawable.mexican_burg,
            "Mexican Burger",
            "A fiery burger with a Mexican twist! It features a spicy beef patty, jalapenos, guacamole, salsa, and cheese, served in a toasted bun. Comes with a side of seasoned wedges and a cool drink.",
            "15 minutes",
            "$11.99",
            "280g"
        ),
        Dish(
            5,
            R.drawable.vegetarian_burg,
            "Vegetarian Burger",
            "A delightful burger for vegetarians! It's packed with a grilled veggie patty, lettuce, tomatoes, onions, pickles, and a tangy sauce, all sandwiched between a soft bun. Served with a side of sweet potato fries.",
            "12 minutes",
            "$8.99",
            "200g"
        ),
        Dish(
            6,
            R.drawable.classic_burg_with_chick_potat,
            "Classic Burger with Chicken Potato",
            "A classic beef burger with a twist! Enjoy a juicy beef patty, cheese, lettuce, onions, pickles, and special sauce in a soft bun. Served with crispy chicken potato bites.",
            "14 minutes",
            "$10.99",
            "260g"
        ),
        Dish(
            7,
            R.drawable.medium_burg_with_potat,
            "Medium Burger with Potato",
            "A satisfying burger with a medium-sized beef patty, lettuce, tomatoes, onions, and mayo, all served in a soft bun. Accompanied by a generous portion of seasoned potato wedges.",
            "13 minutes",
            "$9.99",
            "240g"
        ),Dish(
            8,
            R.drawable.medium_burg_with_chips,
            "Medium Burger with Chips",
            "Indulge in a medium-sized beef patty, topped with cheese, lettuce, pickles, and ketchup, all nestled in a soft bun. Served with a side of crispy potato chips.",
            "13 minutes",
            "$9.99",
            "230g"
        ),
        Dish(
            9,
            R.drawable.bigtasty_menu,
            "Big Tasty Menu",
            "A grand feast for burger enthusiasts! Enjoy a double beef patty, bacon, lettuce, onions, cheese, and special sauce, all stacked in a sesame seed bun. Comes with a large portion of golden fries and a choice of drink.",
            "20 minutes",
            "$14.99",
            "400g"
        ),
    )
    var standardPositionPizza = mutableListOf<Dish>(
        Dish(1, R.drawable.bolgarian_pizza, "Bolgarian Pizza", "This pizza includes a blend of Bulgarian flavors with a variety of locally sourced ingredients. It features a thin crust topped with feta cheese, fresh tomatoes, olives, and traditional Bulgarian spices.", "20 minutes", "$12.99", "350 grams"),
        Dish(2, R.drawable.eastukranian_pizza, "East Ukrainian Pizza", "This unique pizza combines the flavors of Eastern Ukraine. It has a thick crust with a generous topping of smoked sausage, sauerkraut, mushrooms, and melted cheese.", "25 minutes", "$14.99", "400 grams"),
        Dish(3, R.drawable.greece_pizza, "Greek Pizza", "Experience the taste of Greece with this delicious pizza. It features a crispy crust topped with tangy tzatziki sauce, feta cheese, kalamata olives, fresh tomatoes, and a sprinkle of oregano.", "18 minutes", "$10.99", "300 grams"),
        Dish(4, R.drawable.mexican_pizza, "Mexican Pizza", "Indulge in the vibrant flavors of Mexico with this mouthwatering pizza. It comes with a spicy tomato sauce, seasoned ground beef, jalapeños, bell peppers, onions, and a generous layer of melted cheese.", "22 minutes", "$11.99", "350 grams"),
        Dish(5, R.drawable.mix_pizza, "Mixed Pizza", "This pizza is a medley of various flavors and toppings. It features a combination of pepperoni, sausage, mushrooms, bell peppers, onions, and melted cheese on a classic crust.", "20 minutes", "$13.99", "380 grams"),
        Dish(6, R.drawable.peperoniveget_pizza, "Pepperoni Veggie Pizza", "Enjoy the best of both worlds with this pepperoni and veggie combo. It includes a thin crust topped with pepperoni slices, mushrooms, bell peppers, onions, black olives, and melted cheese.", "18 minutes", "$12.99", "360 grams"),
        Dish(7, R.drawable.seafood_pizza, "Seafood Pizza", "This pizza is a seafood lover's dream. It features a thin and crispy crust topped with a delectable combination of shrimp, crab meat, squid, garlic, herbs, and a sprinkle of Parmesan cheese.", "25 minutes", "$15.99", "420 grams"),
        Dish(8, R.drawable.southukranian_pizza, "South Ukrainian Pizza", "Experience the flavors of Southern Ukraine with this unique pizza. It has a fluffy crust topped with traditional Ukrainian sausage, pickles, onions, garlic, and a drizzle of sour cream.", "23 minutes", "$13.99", "380 grams"),
        Dish(9, R.drawable.students_pizza, "Student's Pizza", "This budget-friendly pizza is perfect for students. It comes with a classic crust topped with a simple yet satisfying combination of tomato sauce, mozzarella cheese, and your choice of two additional toppings.", "15 minutes", "$9.99", "300 grams"),
        Dish(10, R.drawable.vegetarian_pizza, "Vegetarian Pizza", "For the veggie lovers out there, this pizza is a delight. It features a thin crust topped with a colorful assortment of fresh vegetables, including bell peppers, onions, tomatoes, mushrooms, and olives.", "18 minutes", "$11.99", "340 grams"),
        Dish(11, R.drawable.westukranian_pizza, "West Ukrainian Pizza", "Get a taste of Western Ukraine with this hearty pizza. It has a thick crust topped with succulent roasted pork, cabbage, potatoes, onions, and melted cheese.", "27 minutes", "$14.99", "400 grams")
    )
    var standardPositionDrinks = mutableListOf<Dish>(
        Dish(1, R.drawable.beer_drink, "Beer", "An alcoholic beverage made from fermented grains, typically barley, flavored with hops. It is a popular choice to accompany pizza.", "Instant", "$5.99", "330ml"),
        Dish(2, R.drawable.cola_drink, "Cola", "A carbonated soft drink containing caffeine and sweeteners. It provides a refreshing and fizzy taste that complements the flavors of pizza.", "Instant", "$1.99", "500ml"),
        Dish(3, R.drawable.energy_drink, "Energy Drink", "A beverage containing stimulant substances, such as caffeine and taurine, designed to provide a boost of energy. It pairs well with pizza, especially during long nights.", "Instant", "$2.49", "250ml"),
        Dish(4, R.drawable.fanta_drink, "Fanta", "A fruity carbonated soft drink available in various flavors. It offers a vibrant and refreshing taste that enhances the enjoyment of pizza.", "Instant", "$1.99", "500ml"),
        Dish(5, R.drawable.kvas_drink, "Kvas", "A traditional fermented beverage made from rye bread. It has a slightly sweet and tangy flavor, making it an interesting choice to complement pizza.", "Instant", "$2.99", "330ml"),
        Dish(6, R.drawable.lemonade_drink, "Lemonade", "A sweet and tangy non-alcoholic beverage made from lemon juice, sugar, and water. It provides a zesty and refreshing taste that goes well with pizza.", "Instant", "$2.49", "500ml"),
        Dish(7, R.drawable.mohito_drink, "Mojito", "A classic cocktail made with white rum, lime juice, sugar, soda water, and mint leaves. Its minty and citrusy flavors offer a delightful contrast to the flavors of pizza.", "5 minutes", "$7.99", "250ml"),
        Dish(8, R.drawable.pepsi_drink, "Pepsi", "A carbonated cola soft drink known for its distinct flavor. It provides a great companion to pizza, with its sweet and slightly tangy taste.", "Instant", "$1.99", "500ml"),
        Dish(9, R.drawable.schweppes_drink, "Schweppes", "A range of carbonated beverages available in various flavors, including tonic water, ginger ale, and club soda. They offer a fizzy and versatile option to pair with pizza.", "Instant", "$1.99", "500ml"),
        Dish(10, R.drawable.sprite_drink, "Sprite", "A lemon-lime flavored carbonated soft drink known for its crisp and clean taste. It provides a refreshing and citrusy complement to the flavors of pizza.", "Instant", "$1.99", "500ml")
        )
}