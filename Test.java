package MucZaBuc;

import java.util.List;
//Направи инстанцу класе Meals (Само један објекат)
//9. Написати програм који тестира горе написане класе:
public class Test {
    public static void main(String[] args) {
Drink p = new Drink(780.25, 25.0,10.0,45.0,25.0,4.0);
Drink p1 =new Drink (530.0,20.0, 15.0,12.0,25.5,5.0);

Meal m1 = new Meal(4646464,nutriment ,"Dynazzy");



//Dynazzy , "Cleaner  -  Lime  Away" , 78.25 , 770.09 , 18.23 , 10.04 , 7.74 , 6.3
// Vinder , "Tart  Shells  -  Barquettes,  Savory" , 73.54 , 495.52 , 6.62 , 21.45 , 13.24 , 18.82
// Demimbu , "Broom  -  Corn" , 368.65 , 472.08 , 19.26 , 2.91 , 14.95 , 2.38
// Thoughtbeat , "Lamb  -  Sausage  Casings" , 552.21 , 1448.35 , 3.31 , 9.06 , 18.95 , 21.31
// Zoomlounge , "Lettuce  -  Mini  Greens,  Whole" , 652.65 , 1466.6 , 5.41 , 13.07 , 16.36 , 19.53
// Skaboo , "Plasticspoonblack" , 880.37 , 849.41 , 13.29 , 22.78 , 2.31 , 22.23
// Reallinks , "Cheese  -  Swiss  Sliced" , 360.39 , 104.49 , 11.44 , 17.22 , 17.18 , 20.9
// Blogpad , "Eggplant  Oriental" , 870.63 , 31.0 , 19.49 , 1.11 , 6.17 , 13.73
// Edgewire , "Glaze  -  Clear" , 162.17 , 278.86 , 21.92 , 18.67 , 18.7 , 11.27
// Aivee , "Wine  -  Placido  Pinot  Grigo" , 497.63 , 420.02 , 19.92 , 14.73 , 9.7 , 4.21
// Aivee , "Shiratamako  -  Rice  Flour" , 492.31 , 490.32 , 16.48 , 19.15 , 23.68 , 3.34
// Camimbo , "Soup  -  Campbells  Mushroom" , 427.68 , 578.32 , 9.02 , 8.88 , 19.25 , 24.91
// Topicblab , "Coffee  Guatemala  Dark" , 824.7 , 563.19 , 1.39 , 14.41 , 24.72 , 13.01
// Fivechat , "Wine  -  Magnotta  -  Pinot  Gris  Sr" , 678.68 , 414.5 , 8.53 , 5.18 , 24.47 , 21.83
// Agimba , "Muffin  -  Banana  Nut  Individual" , 366.13 , 1202.69 , 0.67 , 3.53 , 0.71 , 8.04
// Einti , "Tarts  Assorted" , 728.18 , 986.88 , 21.19 , 12.03 , 10.1 , 21.87
// Thoughtblab , "Vinegar  -  Balsamic,  White" , 204.78 , 865.55 , 19.97 , 9.63 , 20.08 , 6.65
// Buzzdog , "Wine  -  Piper  Heidsieck  Brut" , 120.75 , 862.29 , 21.12 , 19.5 , 5.34 , 1.06
// LiveZ , "Beef  -  Ground  Medium" , 797.59 , 628.1 , 11.5 , 2.67 , 20.11 , 16.57
// Tavu , "Bacardi  Mojito" , 91.93 , 825.09 , 3.73 , 19.57 , 11.03 , 11.19
// Edgewire , "Turnip  -  Wax" , 696.87 , 46.05 , 21.22 , 18.7 , 5.52 , 7.08
// Linklinks , "Eggplant  -  Regular" , 114.72 , 113.61 , 12.48 , 20.64 , 13.81 , 21.76
// Kwinu , "Yogurt  -  French  Vanilla" , 27.1 , 999.03 , 8.34 , 12.45 , 0.46 , 6.49
// Zoomzone , "Wine  -  Kwv  Chenin  Blanc  South" , 659.8 , 726.16 , 14.5 , 16.52 , 21.58 , 15.95
// Kwideo , "Corn  Kernels  -  Frozen" , 663.36 , 1217.84 , 12.61 , 4.19 , 22.9 , 24.27
// Ailane , "Goat  -  Leg" , 57.3 , 829.47 , 4.04 , 24.75 , 14.02 , 22.18
// Zazio , "Wine  -  White,  Pelee  Island" , 641.52 , 415.02 , 12.51 , 23.78 , 21.82 , 14.34
// Browsezoom , "Salt  And  Pepper  Mix  -  White" , 33.97 , 150.07 , 0.19 , 24.4 , 1.07 , 2.08
// Fivebridge , "Wonton  Wrappers" , 75.13 , 334.62 , 2.9 , 19.31 , 11.76 , 19.59
// Twitterwire , "Bagelers" , 17.52 , 64.76 , 5.44 , 7.49 , 17.65 , 3.94
// Meemm , "Split  Peas  -  Green,  Dry" , 272.48 , 1444.27 , 4.41 , 8.01 , 12.57 , 18.46
// Photobug , "Muffin  Batt  -  Ban  Dream  Zero" , 483.7 , 592.87 , 12.94 , 14.8 , 24.57 , 12.81
// Gigabox , "Wine  -  Ice  Wine" , 361.58 , 779.91 , 7.09 , 17.62 , 10.85 , 5.26
// Meejo , "Bar  -  Granola  Trail  Mix  Fruit  Nut" , 104.1 , 1487.42 , 2.28 , 7.6 , 16.87 , 9.88
// Twitterbridge , "Lobster  -  Tail  6  Oz" , 210.13 , 995.52 , 15.61 , 13.28 , 19.23 , 1.71
// Youopia , "Nut  -  Almond,  Blanched,  Ground" , 653.97 , 730.87 , 19.15 , 24.67 , 9.34 , 0.39
// Leenti , "Juice  -  Grapefruit,  341  Ml" , 829.03 , 1398.13 , 24.65 , 17.15 , 21.79 , 13.36
// Jayo , "Soup  Campbells  Turkey  Veg." , 740.5 , 256.31 , 8.02 , 11.47 , 1.66 , 15.06
// Ailane , "Curry  Powder  Madras" , 642.94 , 883.06 , 16.36 , 17.22 , 18.38 , 22.17
// Livefish , "Chips  Potato  Swt  Chilli  Sour" , 664.75 , 431.43 , 22.91 , 4.3 , 5.33 , 5.46
// Tambee , "Pepper  -  Chillies,  Crushed" , 18.49 , 1495.77 , 7.39 , 14.72 , 21.58 , 21.43
// Edgetag , "Pork  -  European  Side  Bacon" , 116.63 , 458.65 , 21.59 , 12.81 , 20.63 , 22.37
// Trudeo , "Mushroom  -  Morels,  Dry" , 899.89 , 1013.21 , 14.44 , 2.86 , 0.31 , 1.38
// Photobug , "Cake  Circle,  Paprus" , 584.22 , 289.04 , 17.35 , 3.9 , 15.74 , 16.29
// Kimia , "Cranberries  -  Fresh" , 496.69 , 478.81 , 13.86 , 24.71 , 15.35 , 6.69
// Edgewire , "Bread  -  Wheat  Baguette" , 758.41 , 312.07 , 18.66 , 6.48 , 11.99 , 4.16
// Yombu , "Sobe  -  Liz  Blizz" , 14.84 , 1423.13 , 6.28 , 18.78 , 0.47 , 4.56
// Skajo , "Wine  -  Marlbourough  Sauv  Blanc" , 311.8 , 551.16 , 0.87 , 19.57 , 24.63 , 20.28
// Topdrive , "Wine  -  White,  Concha  Y  Toro" , 152.14 , 57.62 , 18.99 , 21.49 , 7.29 , 21.8
// Zoombeat , "Veal  -  Osso  Bucco" , 698.57 , 949.46 , 22.87 , 2.27 , 22.58 , 15.9
// Skinte , "Tea  -  Lemon  Green  Tea" , 158.09 , 1446.73 , 1.86 , 11.7 , 10.67 , 16.0
// Youbridge , "Dc  Hikiage  Hira  Huba" , 785.88 , 1087.74 , 17.18 , 22.9 , 10.24 , 9.41
// Oyoba , "Cocoa  Powder  -  Dutched" , 743.69 , 1472.86 , 22.3 , 13.43 , 6.66 , 4.06
// Blogpad , "Food  Colouring  -  Red" , 353.62 , 423.22 , 6.66 , 10.48 , 3.04 , 16.98
// Linklinks , "Bacardi  Raspberry" , 7.38 , 777.31 , 23.47 , 15.43 , 7.89 , 23.03
// Tekfly , "Chicken  Breast  Halal" , 76.17 , 1146.11 , 10.46 , 0.41 , 21.35 , 8.63
// Tambee , "Wine  -  White,  Ej" , 81.93 , 952.83 , 19.92 , 21.71 , 4.87 , 9.82
// Yakidoo , "Salt  -  Celery" , 755.88 , 326.07 , 0.35 , 4.47 , 10.08 , 14.27
// Avamba , "Peas  Snow" , 879.22 , 1208.82 , 21.36 , 1.4 , 21.28 , 5.0
// Dabfeed , "Pail  -  4l  White,  With  Handle" , 472.74 , 1045.0 , 10.65 , 6.94 , 21.84 , 2.59
// Skyndu , "Tuna  -  Sushi  Grade" , 146.27 , 436.82 , 0.59 , 9.55 , 5.05 , 16.63
// Flashspan , "Wine  -  Harrow  Estates,  Vidal" , 884.48 , 1417.45 , 16.87 , 12.18 , 17.34 , 4.82
// Npath , "Rum  -  Coconut,  Malibu" , 353.08 , 626.07 , 5.24 , 0.68 , 18.2 , 10.09
// Kwideo , "Carrots  -  Jumbo" , 854.74 , 1187.32 , 15.12 , 7.01 , 19.66 , 9.44
// Buzzbean , "Carrots  -  Purple,  Organic" , 499.14 , 428.5 , 9.22 , 6.13 , 22.95 , 20.0
// Livefish , "Cheese  -  Woolwich  Goat,  Log" , 5.64 , 882.59 , 4.25 , 1.73 , 12.5 , 5.85
// Vidoo , "Juice  Peach  Nectar" , 206.07 , 645.43 , 15.24 , 18.4 , 3.29 , 23.25
// Omba , "Wine  -  Mas  Chicet  Rose,  Vintage" , 770.17 , 1265.12 , 13.57 , 10.98 , 3.24 , 3.8
// Janyx , "Soup  -  Beef  Conomme,  Dry" , 377.33 , 1412.19 , 7.4 , 19.07 , 2.0 , 13.58
// Gigaclub , "Bread  Base  -  Toscano" , 570.76 , 1364.35 , 19.75 , 23.34 , 14.0 , 22.06
// Wikizz , "Pork  -  Backfat" , 287.11 , 1482.25 , 0.93 , 13.06 , 10.7 , 14.3
// Minyx , "Pepper  -  Pablano" , 249.98 , 676.92 , 22.19 , 19.98 , 7.8 , 24.15
// Kanoodle , "Bananas" , 536.05 , 819.06 , 20.86 , 5.12 , 3.06 , 18.47
// Twimm , "Cinnamon  -  Stick" , 693.23 , 409.91 , 15.43 , 6.49 , 16.95 , 5.47
// Meejo , "Ecolab  -  Lime  -  A  -  Way  4/4  L" , 198.91 , 96.45 , 22.98 , 13.56 , 4.89 , 4.93
// Zoozzy , "Brocolinni  -  Gaylan,  Chinese" , 766.1 , 913.5 , 8.44 , 5.41 , 22.28 , 20.38
// Realbridge , "Soup  -  Knorr,  Classic  Can.  Chili" , 119.84 , 424.71 , 11.38 , 5.23 , 12.57 , 22.31
// Dabtype , "Cilantro  /  Coriander  -  Fresh" , 779.18 , 966.12 , 6.89 , 1.28 , 3.94 , 6.06
// Quaxo , "Pepperoni  Slices" , 125.41 , 853.62 , 23.24 , 22.14 , 1.7 , 4.15
// Linkbuzz , "Tea  -  Earl  Grey" , 652.89 , 805.26 , 3.32 , 12.69 , 14.53 , 14.47
// Dynazzy , "Wine  -  Zonnebloem  Pinotage" , 710.13 , 1291.82 , 13.34 , 19.51 , 19.14 , 3.41
// Riffwire , "Water  Chestnut  -  Canned" , 200.42 , 377.43 , 5.78 , 15.15 , 1.12 , 4.75
// Avamba , "Juice  -  Cranberry,  341  Ml" , 857.13 , 721.55 , 3.51 , 24.1 , 0.34 , 9.73
// Skibox , "Cookie  Dough  -  Oatmeal  Rasin" , 80.76 , 837.48 , 7.2 , 7.87 , 15.34 , 6.57
// Geba , "Cheese  -  St.  Andre" , 502.05 , 1051.95 , 2.7 , 9.31 , 17.6 , 6.64
// Meezzy , "Noodles  -  Steamed  Chow  Mein" , 469.12 , 976.45 , 3.62 , 12.27 , 1.2 , 17.07
// Edgewire , "Mushroom  -  Morel  Frozen" , 624.46 , 74.39 , 20.65 , 5.76 , 5.32 , 18.65
// Zoomlounge , "Pancetta" , 717.17 , 228.97 , 13.63 , 2.25 , 11.24 , 6.01
// Kare , "Coffee  -  Decafenated" , 405.78 , 1370.27 , 20.88 , 13.04 , 23.2 , 2.95
// Thoughtstorm , "Veal  -  Kidney" , 750.36 , 962.41 , 17.11 , 9.9 , 10.15 , 3.31
// Fatz , "Tart  Shells  -  Savory,  4" , 409.12 , 697.99 , 13.34 , 20.77 , 7.17 , 1.3
// Chatterpoint , "Pork  -  Back,  Short  Cut,  Boneless" , 67.83 , 218.93 , 3.77 , 1.94 , 9.65 , 4.37
// Skinix , "Wine  -  Red,  Black  Opal  Shiraz" , 265.49 , 304.46 , 10.42 , 22.08 , 12.2 , 9.92
// Fivespan , "Mousse  -  Passion  Fruit" , 863.77 , 176.22 , 4.23 , 22.3 , 11.9 , 14.53
// Skyba , "Pastry  -  Lemon  Danish  -  Mini" , 666.79 , 958.19 , 22.15 , 6.18 , 12.97 , 16.13
// Realcube , "Asparagus  -  Mexican" , 323.72 , 1200.48 , 20.76 , 6.05 , 13.94 , 20.93
// Quimm , "Petit  Baguette" , 863.38 , 643.67 , 8.23 , 13.49 , 7.17 , 9.45
// Flipbug , "Durian  Fruit" , 438.15 , 1262.13 , 1.34 , 15.58 , 21.26 , 17.89
// Thoughtstorm , "Orange  -  Canned,  Mandarin" , 887.42 , 987.51 , 11.69 , 13.82 , 9.76 , 18.43
// Quatz , "Lobster  -  Cooked" , 631.26 , 650.59 , 18.61 , 7.88 , 22.08 , 11.17

    }
}

