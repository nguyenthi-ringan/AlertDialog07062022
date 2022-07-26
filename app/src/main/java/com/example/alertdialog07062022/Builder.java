package com.example.alertdialog07062022;

public interface Builder {
    Builder setDesserts(Desserts desserts);
    Builder setBoxMeals(BoxMeals boxMeals);
    Builder setRiceMeals(RiceMeals riceMeals);
    Builder setSnacks(Snacks snacks);
    Builder setDrinks(Drinks drinks);
    FastFood build();
}
