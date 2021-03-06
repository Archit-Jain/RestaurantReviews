package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.widget.Button;

import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView ListId;
    ArrayList<product> list;
    String records;

    TextView text,errorText;

    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListId = (ListView) findViewById(R.id.listId);
//
       // show = (Button) findViewById(R.id.button2);

        list = new ArrayList<product>();
        // savve in the arrayList
        product product0= new product("RestID"       	,"LocID",         "Cuisine",             "Star");
        product product1= new product("R0001",   	        	"L01",	     	 "Irish",					"3");
        product product2= new product("R0002",      	    	"L41",		     "Mediterranean",	"3");
        product product3= new product("R0003",             		"L33",			 "European",				"3");
        product product4= new product("R0004",	             	"L18",			 "Gastro Pub","2");
        product product5= new product("R0005",      		    "L01",			 "Afternoon Tea",		  	"3");
        product product6= new product("R0006",    	        	"L11",			 "Afternoon Tea",		  	"3");
        product product7= new product("R0007",	    	        "L04",			 "Indian",			  	"3");
        product product8= new product("R0008",	               	"L22",			 "International",		  	"1");
        product product9= new product("R0009",	              	"L16",			 "French",				  	"3");
        product product10= new product("R0010",	               	"L26",			 "Contemporary European",  "1");
        product product11= new product("R0011",	               	"L21",			 "Italian",				"3");
        product product12= new product("R0012",	              	"L08",	  		 "Cafe Dining",		"2");
        product product13= new product("R0013",	              	"L25",			 "Barbecue", 				"3");
        product product14= new product("R0014",		   	        "L25",			 "Irish", 					"3");
        product product15= new product("R0015",		            "L01",			 "Contemporary European",  "1");
        product product16= new product("R0016",	    	        "L08",			 "Italian", 				"4");
        product product17= new product("R0017",	            	"L31",			 "Pub", 					"2");
        product product18= new product("R0018",	            	"L07",			 "Irish", 					"3");
        product product19= new product("R0019",	    	        "L04",			 "Steak", 					"1");
        product product20= new product("R0020",	            	"L48",			 "Pizzeria", 				"2");
        product product21= new product("R0021",	    	        "L25",			 "Italian", 				"3");
        product product22= new product("R0022",	    	        "L27",			 "International", 			"3");
        product product23= new product("R0023",		            "L56",			 "Nepalese"	,		"3");
        product product24= new product("R0024",   		        "L19",			 "European" ,				"3");
        product product25= new product("R0025",	    	        "L04",			 "Barbecue" ,				"3");
        product product26= new product("R0026",	    	        "L08",			 "Pizzeria" ,				"4");
        product product27= new product("R0027",	    	        "L05",			 "Modern European",	"1");
        product product28= new product("R0028",	    	        "L08",			 "Burgers", 				"3");
        product product29= new product("R0029",	               	"L44",			 "Gastro Pub", 			"3");
        product product30= new product("R0030",	            	"L16",			 "Modern European", 		"2");
        product product31= new product("R0031",	            	"L03",			 "International", 			"3");
        product product32= new product("R0032",	            	"L03",			 "Irish", 					"2");
        product product33= new product("R0033",	             	"L01",			 "Barbecue", 				"3");
        product product34= new product("R0034",	             	"L59",			 "American", 				"3");
        product product35= new product("R0035",	    	        "L15",			 "American", 				"2");
        product product36= new product("R0036",	    	        "L01",			 "Fish", 					"2");
        product product37= new product("R0037",       	    	"L04",			 "Italian", 				"4");
        product product38= new product("R0038",	               	"L20",			 "Japanese  Teppanyaki", 	"3");
        product product39= new product("R0039",	            	"L47",			 "European", 				"3");
        product product40= new product("R0040",	            	"L15",			 "Thai", 					"3");
        product product41= new product("R0041",	               	"L21",			 "European", 				"2");
        product product42= new product("R0042",	            	"L04",			 "Contemporary European", 	"1");
        product product43= new product("R0043",	               	"L24",			 "International","2");
        product product44= new product("R0044",	    			"L10",			 "Irish", 					"2");
        product product45= new product("R0045",	    			"L01",			 "Mediterranean", 			"2");
        product product46= new product("R0046",	    			"L04",			 "International", 			"4");
        product product47= new product("R0047",	    			"L03",			 "Irish", 					"5");
        product product48= new product("R0048",	    			"L13",			 "Indian", 				"2");
        product product49= new product("R0049",	    			"L05",			 "Indian", 				"3");
        product product50= new product("R0050",	    			"L01",			 "Italian", 				"3");
        product product51= new product("R0051",		    		"L01",			 "Italian",				"1");
        product product52= new product("R0052",   				"L08",			 "Japanese", 				"3");
        product product53= new product("R0053",	    			"L49",			 "Mediterranean", 			"3");
        product product54= new product("R0054",	    			"L10",			 "American", 				"1");
        product product55= new product("R0055",	    			"L04",			 "American", 				"2");
        product product56= new product("R0056",	    			"L01",			 "Irish", 					"2");
        product product57= new product("R0057",	    	        "L08",			 "Grill", 					"1");
        product product58= new product("R0058",           		"L20",			 "Irish", 					"3");
        product product59= new product("R0059",	            	"L08",			 "Italian", 				"3");
        product product60= new product("R0060",	             	"L01",			 "Dining Bar", 			"3");
        product product61= new product("R0061",	            	"L01",			 "Tapas / Small Plates", 	"2");
        product product62= new product("R0062",	            	"L01",			 "Irish", 					"1");
        product product63= new product("R0063",					"L01",			 "Contemporary European", 	"4");
        product product64= new product("R0064",					"L29",			 "Gastro Pub", 			"2");
        product product65= new product("R0065",					"L01",			 "Steak", 					"5");
        product product66= new product("R0066",					"L04",			 "Seafood", 				"3");
        product product67= new product("R0067",					"L07",			 "Seafood",				"4");
        product product68= new product("R0068",					"L34",			 "Irish", 					"3");
        product product69= new product("R0069",					"L59",			 "Italian", 				"2");
        product product70= new product("R0070",					"L01",			 "Irish", 					"3");
        product product71= new product("R0071",					"L50",			 "Asian", 					"3");
        product product72= new product("R0072",					"L01",			 "Comfort Food", 			"3");
        product product73= new product("R0073",					"L21",			 "Italian", 				"4");
        product product74= new product("R0074",					"L36",			 "Irish", 					"1");
        product product75= new product("R0075",					"L27",			 "Italian", 				"3");
        product product76= new product("R0076",					"L63",			 "Irish", 					"3");
        product product77= new product("R0077",					"L32",			 "Tapas / Small Plates", 	"1");
        product product78= new product("R0078",					"L21",			 "Mediterranean", 			"3");
        product product79= new product("R0079",					"L33",			 "Italian",				"3");
        product product80= new product("R0080",					"L04",			 "International", 			"3");
        product product81= new product("R0081",					"L35",			 "Indian", 				"3");
        product product82= new product("R0082",					"L01",			 "Middle Eastern", 		"3");
        product product83= new product("R0083",					"L01",			 "International", 			"1");
        product product84= new product("R0084",					"L03",			 "Mediterranean", 			"3");
        product product85= new product("R0085",					"L30",			 "Nepalese", 				"3");
        product product86= new product("R0086",					"L08",			 "Asian", 					"3");
        product product87= new product("R0087",					"L17",			 "Indian", 				"3");
        product product88= new product("R0088",					"L44",			 "Indian", 				"3");
        product product89= new product("R0089",					"L45",			 "Malaysian", 				"3");
        product product90= new product("R0090",					"L37",			 "Soul food", 				"3");
        product product91= new product("R0091",					"L08",			 "Asian", 					"3");
        product product92= new product("R0092",					"L01",			 "Bistro", 				"1");
        product product93= new product("R0093",					"L22",			 "Italian", 				"1");
        product product94= new product("R0094",					"L42",			 "Italian", 				"2");
        product product95= new product("R0095",					"L64",			 "Italian", 				"3");
        product product96= new product("R0096",					"L01",			 "French", 				"4");
        product product97= new product("R0097",					"L11",			 "Contemporary European", 	"3");
        product product98= new product("R0098",					"L27",			 "Mediterranean", 			"4");
        product product99= new product("R0099",					"L21",			 "American", 				"1");
        product product100= new product("R0100",				"L23",			 "French", 				"3");
        product product101= new product("R0101",				"L65",			 "French", 				"2");
        product product102= new product("R0102",				"L57",			 "International", 			"3");
        product product103= new product("R0103",				"L36",			 "Italian", 				"3");
        product product104= new product("R0104",				"L39",			 "American", 				"3");
        product product105= new product("R0105",				"L24",			 "Afternoon Tea", 			"3");
        product product106= new product("R0106",				"L52",			 "Indian", 				"3");
        product product107= new product("R0107",				"L37",			 "Indian", 				"2");
        product product108= new product("R0108",				"L27",			 "Thai", 					"3");
        product product109= new product("R0109",				"L03",			 "Steakhouse", 			"4");
        product product110= new product("R0110",				"L14",			 "Gastro Pub", 			"3");
        product product111= new product("R0111",				"L59",			 "Irish", 					"3");
        product product112= new product("R0112",				"L08",			 "Sushi", 					"3");
        product product113= new product("R0113",				"L61",			 "Indian", 				"3");
        product product114= new product("R0114",				"L05",			 "Italian", 				"1");
        product product115= new product("R0115",				"L51",			 "Italian", 				"3");
        product product116= new product("R0116",				"L04",			 "Irish", 					"2");
        product product117= new product("R0117",				"L11",			 "Gastro Pub", 			"3");
        product product118= new product("R0118",				"L45",			 "Chinese", 				"2");
        product product119= new product("R0119",				"L04",			 "Irish", 					"2");
        product product120= new product("R0120",				"L16",			 "Contemporary European", 	"2");
        product product121= new product("R0121",				"L01",			 "Pan-Asian", 				"3");
        product product122= new product("R0122",				"L02",			 "Italian", 				"5");
        product product123= new product("R0123",				"L01",			 "Italian", 				"2");
        product product124= new product("R0124",				"L59",			 "Italian", 				"3");
        product product125= new product("R0125",				"L58",			 "Chinese", 				"2");
        product product126= new product("R0126",				"L52",			 "Irish", 					"2");
        product product127= new product("R0127",				"L21",			 "European", 				"3");
        product product128= new product("R0128",				"L01",			 "Contemporary European", 	"5");
        product product129= new product("R0129",				"L04",			 "Wine Bar", 				"3");
        product product130= new product("R0130",				"L21",			 "Italian", 				"3");
        product product131= new product("R0131",				"L04",			 "Italian", 				"3");
        product product132= new product("R0132",				"L21",			 "Pizza Bar", 				"3");
        product product133= new product("R0133",				"L27",			 "Japanese",			"2");
        product product134= new product("R0134",				"L34",			 "Contemporary European", 	"3");
        product product135= new product("R0135",				"L04",			 "International" ,			"2");
        product product136= new product("R0136",				"L25",			 "Seafood", 				"1");
        product product137= new product("R0137",				"L25",			 "Seafood", 				"1");
        product product138= new product("R0138",				"L04",			 "Italian", 				"3");
        product product139= new product("R0139",				"L55",			 "American", 				"3");
        product product140= new product("R0140",				"L05",			 "Irish", 					"1");
        product product141= new product("R0141",				"L26",			 "Thai", 					"3");
        product product142= new product("R0142",				"L01",			 "Thai", 					"3");
        product product143= new product("R0143",				"L05",			 "Italian", 				"5");
        product product144= new product("R0144",				"L25",			 "Irish", 					"2");
        product product145= new product("R0145",				"L10",			 "Middle Eastern", 		"4");
        product product146= new product("R0146",				"L01",			 "Steakhouse", 			"3");
        product product147= new product("R0147",				"L01",			 "Irish", 					"2");
        product product148= new product("R0148",				"L25",			 "International", 			"2");
        product product149= new product("R0149",				"L01",			 "Japanese", 				"3");
        product product150= new product("R0150",				"L22",			 "Seafood", 				"2");
        product product151= new product("R0151",				"L01",			 "Italian ",				"1");
        product product152= new product("R0152",				"L10",			 "Fusion / Eclectic", 		"2");
        product product153= new product("R0153",				"L01",			 "International", 			"1");
        product product154= new product("R0154",				"L09",			 "Contemporary European", 	"3");
        product product155= new product("R0155",				"L01",			 "Sushi", 					"3");
        product product156= new product("R0156",				"L05",			 "Japanese", 				"1");
        product product157= new product("R0157",				"L04",			 "Asian", 					"3");
        product product158= new product("R0158",				"L15",			 "Italian", 				"2");
        product product159= new product("R0159",				"L54",			 "Asian", 					"3");
        product product160= new product("R0160",				"L05",			 "Japanese", 				"3");
        product product161= new product("R0161",				"L13",			 "European", 				"3");
        product product162= new product("R0162",				"L11",			 "Irish", 					"3");
        product product163= new product("R0163",				"L25",			 "Wine Bar", 				"3");
        product product164= new product("R0164",				"L38",			 "Mediterranean", 			"2");
        product product165= new product("R0165",				"L11",			 "Irish", 					"2");
        product product166= new product("R0166",				"L01",			 "International", 			"1");
        product product167= new product("R0167",				"L01",			 "Bistro", 				"3");
        product product168= new product("R0168",				"L53",			 "Cafe Dining", 			"2");
        product product169= new product("R0169",				"L21",			 "Gastro Pub", 			"2");
        product product170= new product("R0170",				"L04",			 "Mexican", 				"2");
        product product171= new product("R0171",				"L01",			 "British", 				"5");
        product product172= new product("R0172",				"L52",			 "Indian", 				"2");
        product product173= new product("R0173",				"L01",			 "Irish", 					"3");
        product product174= new product("R0174",				"L08",			 "Irish", 					"3");
        product product175= new product("R0175",				"L15",			 "Italian", 				"2");
        product product176= new product("R0176",				"L25",			 "Afternoon Tea", 			"3");
        product product177= new product("R0177",				"L25",			 "Cocktail Bar", 			"3");
        product product178= new product("R0178",				"L01",			 "Afternoon Tea", 			"4");
        product product179= new product("R0179",				"L01",			 "Gastro Pub", 			"2");
        product product180= new product("R0180",				"L31",			 "Bistro", 				"3");
        product product181= new product("R0181",				"L37",			 "Soul food", 				"3");
        product product182= new product("R0182",				"L04",			 "Pub", 					"3");
        product product183= new product("R0183",				"L13",			 "Contemporary European", 	"2");
        product product184= new product("R0184",				"L22",			 "Japanese", 				"3");
        product product185= new product("R0185",				"L15",			 "Mediterranean", 			"2");
        product product186= new product("R0186",				"L40",			 "Irish", 					"3");
        product product187= new product("R0187",				"L01",			 "Irish",					"5");
        product product188= new product("R0188",				"L46",			 "Contemporary European", 	"5");
        product product189= new product("R0189",				"L34",			 "International", 			"2");
        product product200= new product("R0190",				"L06",			 "Irish", 					"3");
        product product201= new product("R0191",				"L08",			 "American", 				"3");
        product product202= new product("R0192",				"L08",			 "Irish", 					"1");
        product product203= new product("R0193",				"L31",			 "Contemporary European", 	"1");
        product product204= new product("R0194",				"L08",			 "Irish", 					"1");
        product product205= new product("R0195",				"L01",			 "Gastro Pub", 			"2");
        product product206= new product("R0196",				"L08",			 "Pizza Bar", 				"3");
        product product207= new product("R0197",				"L04",			 "American", 				"1");
        product product208= new product("R0198",				"L04",			 "Steakhouse", 			"1");
        product product209= new product("R0199",				"L08",			 "Italian", 				"3");
        product product210= new product("R0200",				"L28",			 "Contemporary European", 	"1");
        product product190= new product("R0201",				"L12",			 "Modern European", 		"1");
        product product191= new product("R0202",				"L43",			 "Contemporary European", 	"3");
        product product192= new product("R0203",				"L43",			 "Tapas / Small Plates", 	"3");
        product product193= new product("R0204",				"L60",			 "International", 			"3");
        product product194= new product("R0205",				"L04",			 "Modern European", 		"4");
        product product195= new product("R0206",				"L10",			 "French", 				"4");
        product product196= new product("R0207",				"L08",			 "Italian",				"3");
        product product197= new product("R0208",				"L08",			 "Japanese", 				"2");
        product product198= new product("R0209",				"L01",			 "Steakhouse", 			"1");
        product product199= new product("R0210",				"L62",			 "Cafe Dining", 			"2");
        product product211= new product("R0211",				"L07",			 "Chinese", 				"3");;
        list.add(product0);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);
        list.add(product9);
        list.add(product10);
        list.add(product11);
        list.add(product12);
        list.add(product13);
        list.add(product14);
        list.add(product15);
        list.add(product16);
        list.add(product17);
        list.add(product18);
        list.add(product19);
        list.add(product20);
        list.add(product21);
        list.add(product22);
        list.add(product23);
        list.add(product24);
        list.add(product25);
        list.add(product26);
        list.add(product27);
        list.add(product28);
        list.add(product29);
        list.add(product30);
        list.add(product31);
        list.add(product32);
        list.add(product33);
        list.add(product34);
        list.add(product35);
        list.add(product36);
        list.add(product37);
        list.add(product38);
        list.add(product39);
        list.add(product40);
        list.add(product41);
        list.add(product42);
        list.add(product43);
        list.add(product44);
        list.add(product45);
        list.add(product46);
        list.add(product47);
        list.add(product48);
        list.add(product49);
        list.add(product50);
        list.add(product51);
        list.add(product52);
        list.add(product53);
        list.add(product54);
        list.add(product55);
        list.add(product56);
        list.add(product57);
        list.add(product58);
        list.add(product59);
        list.add(product60);
        list.add(product61);
        list.add(product62);
        list.add(product63);
        list.add(product64);
        list.add(product65);
        list.add(product66);
        list.add(product67);
        list.add(product68);
        list.add(product69);
        list.add(product70);
        list.add(product71);
        list.add(product72);
        list.add(product73);
        list.add(product74);
        list.add(product75);
        list.add(product76);
        list.add(product77);
        list.add(product78);
        list.add(product79);
        list.add(product80);
        list.add(product81);
        list.add(product82);
        list.add(product83);
        list.add(product84);
        list.add(product85);
        list.add(product86);
        list.add(product87);
        list.add(product88);
        list.add(product89);
        list.add(product90);
        list.add(product91);
        list.add(product92);
        list.add(product93);
        list.add(product94);
        list.add(product95);
        list.add(product96);
        list.add(product97);
        list.add(product98);
        list.add(product99);
        list.add(product100);
        list.add(product101);
        list.add(product102);
        list.add(product103);
        list.add(product104);
        list.add(product105);
        list.add(product106);
        list.add(product107);
        list.add(product108);
        list.add(product109);
        list.add(product110);
        list.add(product111);
        list.add(product112);
        list.add(product113);
        list.add(product114);
        list.add(product115);
        list.add(product116);
        list.add(product117);
        list.add(product118);
        list.add(product119);
        list.add(product120);
        list.add(product121);
        list.add(product122);
        list.add(product123);
        list.add(product124);
        list.add(product125);
        list.add(product126);
        list.add(product127);
        list.add(product128);
        list.add(product129);
        list.add(product130);
        list.add(product131);
        list.add(product132);
        list.add(product133);
        list.add(product134);
        list.add(product135);
        list.add(product136);
        list.add(product137);
        list.add(product138);
        list.add(product139);
        list.add(product140);
        list.add(product141);
        list.add(product142);
        list.add(product143);
        list.add(product144);
        list.add(product145);
        list.add(product146);
        list.add(product147);
        list.add(product148);
        list.add(product149);
        list.add(product150);
        list.add(product151);
        list.add(product152);
        list.add(product153);
        list.add(product154);
        list.add(product155);
        list.add(product156);
        list.add(product157);
        list.add(product158);
        list.add(product159);
        list.add(product160);
        list.add(product161);
        list.add(product162);
        list.add(product163);
        list.add(product164);
        list.add(product165);
        list.add(product166);
        list.add(product167);
        list.add(product168);
        list.add(product169);
        list.add(product170);
        list.add(product171);
        list.add(product172);
        list.add(product173);
        list.add(product174);
        list.add(product175);
        list.add(product176);
        list.add(product177);
        list.add(product178);
        list.add(product179);
        list.add(product180);
        list.add(product191);
        list.add(product192);
        list.add(product193);
        list.add(product194);
        list.add(product195);
        list.add(product196);
        list.add(product197);
        list.add(product198);
        list.add(product199);
        list.add(product200);
        list.add(product201);
        list.add(product202);
        list.add(product203);
        list.add(product204);
        list.add(product205);
        list.add(product206);
        list.add(product207);
        list.add(product208);
        list.add(product209);
        list.add(product210);
        list.add(product211);

        productAdapter adapter = new productAdapter(this, list);
        ListId.setAdapter(adapter);
    }
}