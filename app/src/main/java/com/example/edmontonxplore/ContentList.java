package com.example.edmontonxplore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.edmontonxplore.databinding.ActivityMainBinding;
import com.example.edmontonxplore.databinding.ActivityContentListBinding;

import java.util.ArrayList;

public class ContentList extends AppCompatActivity {
   ActivityContentListBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContentListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

// aa sara data jis nu apa list ch pej raha a
        int[] imageId = {R.drawable.wem0,R.drawable.ram0,R.drawable.einp0,R.drawable.vil0,R.drawable.park0,R.drawable.con0,R.drawable.legi0,R.drawable.art0,R.drawable.air0,R.drawable.days0};
        int[] imageOne = {R.drawable.wem1,R.drawable.wem2};
        int[] imageTwo = {R.drawable.ram1,R.drawable.ram2};
        int[] imageThree = {R.drawable.einp1,R.drawable.einp2};
        int[] imageFour = {R.drawable.vil1,R.drawable.vil2};
        int[] imageFive = {R.drawable.park1,R.drawable.park2};
        int[] imageSix = {R.drawable.con1,R.drawable.con2};
        int[] imageSeven = {R.drawable.legi1,R.drawable.legi2};
        int[] imageEight = {R.drawable.art1,R.drawable.art2};
        int[] imageNine = {R.drawable.air1,R.drawable.air2};
        int[] imageTen = {R.drawable.day1,R.drawable.day2};
        String[] title = {"West Edmonton Mall","Royal Alberta Museum","Elk Island National Park","Ukrainian Cultural Heritage Village","Fort Edmonton Park","Muttart Conservatory","Alberta Legislature Building","Art Gallery of Alberta","Reynolds-Alberta Museum","K Days"};
        Uri[] locations = {Uri.parse("geo:0,0?q=West Edmonton Mall"),Uri.parse("geo:0,0?q=Royal Alberta Museum"),Uri.parse("geo:0,0?q=Elk Island National Park"),Uri.parse("geo:0,0?q=Ukrainian Cultural Heritage Village"),Uri.parse("geo:0,0?q=Fort Edmonton Park"),Uri.parse("geo:0,0?q=Muttart Conservatory"),Uri.parse("geo:0,0?q=Alberta Legislature Building"),Uri.parse("geo:0,0?q=Art Gallery of Alberta"),Uri.parse("geo:0,0?q=Reynolds-Alberta Museum"),Uri.parse("geo:0,0?q=K Days")};

        String[] description = {"Canada's West Edmonton Mall is not only the country's largest shopping center-and one of the largest in the world-it's also a major tourist attraction.",
                "Western Canada's largest museum. Home to a fascinating mix of permanent cultural and natural history exhibits.",
                "covers a wooded area with lakes and wetlands, and is home to all kinds of wildlife, including moose, elk, deer, and beaver.",
                "Established in the 1970s along the Yellowhead Highway, this open-air museum preserves the cultural heritage of the many immigrants from Bukovina and Ukraine who settled in what is now Alberta in the 1890s",
                "Another open-air museum that should be included in your Edmonton travel itinerary, Fort Edmonton Park has old buildings faithfully reconstructed to reflect Edmonton's historical development.",
                "From the high ground above the river, there is a beautiful view of the gleaming pyramids of the Muttart Conservatory against the skyline of Edmonton city center.",
                "In the midst of a park-like garden, where the last Fort Edmonton once stood, is the 1913 Legislature Building. It's an imposing and attractive building, and from the terrace there are beautiful views across the North Saskatchewan River to the far bank.",
                "A twisting modernist building on Sir Winston Churchill Square, the Art Gallery of Alberta in Edmonton is dedicated to visual arts with an emphasis on Western Canada.",
                "One hour by car south of downtown Edmonton is the friendly little town of Wetaskiwin. Here, the main attraction is the Reynolds-Alberta Museum, dedicated to everything to do with aircraft and vehicle construction.",
                "The greatest event in Edmonton's calendar is the 10-day festival known as K Days (formerly called Capital Ex) held every year at the end of July, when the wild days of the 1890 Klondike Gold Rush come to life once more."};
        String[] longMessage = {"Canada's West Edmonton Mall is not only the country's largest shopping center-and one of the largest in the world-it's also a major tourist attraction. In addition to hundreds of shops and restaurants, the facility contains a hotel, movie theaters, an ice rink, an aquarium, and much more.Adding to the appeal are the themed sections of the mall, designed to mimic the feel of popular travel destinations around the world. In Europa Boulevard, for example, many of the shops have European-style fronts and carry the names of international fashion designers, while Bourbon Street, a copy of the famous New Orleans street, is the place to visit for Creole food and live music.The mall's Galaxyland is one of the largest covered, indoor amusement parks in the world, boasting a variety of family-friendly rides, including a triple-loop roller coaster. Also fun is the recently renovated World Waterpark, the largest such attraction in North America. Highlights include the world's biggest indoor wave pool, and two 83-foot-tall (and very steep) water slides. The park, in fact, has a variety of slides, ranging from beginner to extreme.Address: 8882 - 170 Street NW, Edmonton, Alberta",
                "   The Royal Alberta Museum moved to its new location in 2018, and is now western Canada's largest museum. Home to a fascinating mix of permanent cultural and natural history exhibits, as well as always-changing temporary installations, a visit to this ultra-modern facility is certainly time well spent. Particularly impressive are the many fossils from the dinosaur and ice age eras, a large aquaria of native fish, and live insects-including some exotic and enormous species.New additions include a large feature gallery hosting traveling exhibits from across Canada and around the world, a huge new kids' gallery, and a bigger bug room with live invertebrates and a visible nursery. The museum's cultural history departments explore aboriginal cultures with artifacts from Blackfoot, Cree, and other First Nations. A well-stocked gift shop and a café are also located on-site.Address: 9810 103a Ave NW, Edmonton, Alberta",
                "This national park is just a 30-minute drive from Edmonton and covers a wooded area with lakes and wetlands, and is home to all kinds of wildlife, including moose, elk, deer, and beaver. But the main attraction of Elk Island National Park is the large herd of buffalo (bison), which graze over a special enclosure.Anyone driving slowly along the road through the park cannot fail to catch sight of one of these massive shaggy beasts. Fun things to do here in the summer include hiking and biking, kayaking and canoeing, as well as camping, while winter activities include snowshoeing and cross-country skiing.The Beaver Hills area has now been designated as a UNESCO Biosphere Reserve and includes a dark sky preserve, a bird sanctuary, and a wilderness center. Originally the tribal home of the Sarcee Indians, it was the Cree, however, that hunted the beaver and buffalo for their pelts, which were then traded with the large fur-trading companies.With hunting and settlement, the buffalo were almost wiped out, though some Beaver Hills buffalo are thought to have been captured in 1909 and placed in a reserve of their own. These are the forebears of the animals now living in Elk Island National Park. Address: 54401 Range Road 203, Fort Saskatchewan, Alberta",
                "Established in the 1970s along the Yellowhead Highway, this open-air museum preserves the cultural heritage of the many immigrants from Bukovina and Ukraine who settled in what is now Alberta in the 1890s. Known locally simply as the Village, various historic buildings have been reconstructed on the site, and the pale onion dome of a Ukrainian church is visible from afar.There are many living history elements to explore, including a blacksmith, market, and an old-fashioned general store. Part of the fun is the opportunity to interact with the costumed guides, here to explain what life was like for these early settlers. If possible, try to time your visit with one of the many events or workshops hosted throughout the year, from cooking demonstrations to harvest celebrations and a commemoration of Ukraine's national day.Address: Hwy 16 E, Tofield, Alberta",
                "Another open-air museum that should be included in your Edmonton travel itinerary, Fort Edmonton Park has old buildings faithfully reconstructed to reflect Edmonton's historical development. The buildings include a typical 1846 fort belonging to the Hudson's Bay Company, a street from a pioneer town of 1885, the up-and-coming provincial capital in 1905, as well as buildings from the 1920s. Among the different forms of old transport, visitors can ride a horse-drawn wagon or a steam train. At the John Janzen Nature Centre nearby, there are exhibits about local geology and ecology. Address: 7000 143 Street NW, Edmonton, Alberta",
                "On the south bank of the North Saskatchewan River, four pyramid-shaped hothouses are home to rare and far-traveled species of plants. Each pyramid features a distinct environment representing different biomes of the world, from the tropical climate of Myanmar (Burma) and Fiji to the temperate pavilion with its American redwoods and Australian eucalyptus. With so many species of plants on display, the conservatory is the premier horticultural facility in Edmonton. From the high ground above the river, there is a beautiful view of the gleaming pyramids of the Muttart Conservatory against the skyline of Edmonton city center.Address: 9626 96A Street NW, Edmonton, Alberta",
                "In the midst of a park-like garden, where the last Fort Edmonton once stood, is the 1913 Legislature Building. It's an imposing and attractive building, and from the terrace there are beautiful views across the North Saskatchewan River to the far bank. Guided tours are the best way to learn about the history of what the locals refer to fondly as the Ledge, including its architecture and secrets of the building. A highlight of a visit is spending time wandering the park-like grounds surrounding the building.Be sure to also visit the nearby Legislative Assembly Visitor Centre, which includes important displays related to local art, culture, and history. There's also a cool 4D immersive experience that provides an impressive visual history of the province and its people, as well as a great gift shop selling arts and crafts from across Alberta.Address: 10800 97 Ave NW, Edmonton, Alberta",
                "A twisting modernist building on Sir Winston Churchill Square, the Art Gallery of Alberta in Edmonton is dedicated to visual arts with an emphasis on Western Canada. The gallery features changing and traveling exhibitions and maintains an extensive collection of more than 6,000 pieces.The site also features a gift shop, restaurant, and theater space. Private guided tours are available and can be tailored to suit your particular interests. The facility also offers a variety of educational programs for all ages, as well as lectures and workshops.Address: 2 Sir Winston Churchill Square, Edmonton, Alberta",
                "One hour by car south of downtown Edmonton is the friendly little town of Wetaskiwin. Here, the main attraction is the Reynolds-Alberta Museum, dedicated to everything to do with aircraft and vehicle construction. There are open-air displays of old agricultural machinery and tools, including some real old dinosaurs-steam tractors, threshing machines, caterpillar tractors, and trucks.There are also nearly 100 historic aircraft housed here, as well as in the Canadian Aviation Hall of Fame, and numerous vintage motorcycles to admire. A café, store, and theater are also located on-site, with a good time to visit being one of the regular summer events when a variety of machines and vehicles are operating.Address: 6426 40 Avenue, Wetaskiwin, Alberta",
                "The greatest event in Edmonton's calendar is the 10-day festival known as K Days (formerly called Capital Ex) held every year at the end of July, when the wild days of the 1890 Klondike Gold Rush come to life once more. Street-parties, dancing, parades, live entertainment, gold panning, and a midway liven up the whole city. Visitors who plan to be in Edmonton during the festival should be sure to book accommodation well in advance.its structures and attractions around a central theme, often featuring multiple areas with different themes. Unlike temporary and mobile funfairs and carnivals, amusement parks are stationary and built for long-lasting operation. They are more elaborate than city parks and playgrounds, usually providing attractions that cater to a variety of age groups. While amusement parks often contain themed areas, theme parks place a heavier focus with more intricately-designed themes that revolve around a particular subject or group of subjects."};
        // itho uper ala data jaa ria a to display on exact number

        ArrayList<Places> placesArratList = new ArrayList<>();
        for(int i = 0; i < imageId.length ; i++){
            Places places = new Places(title[i],description[i],imageId[i],longMessage[i],imageOne[0],imageTwo[0],locations[i]);
            placesArratList.add(places);
        }

        ListAdapter listAdapter = new ListAdapter(ContentList.this,placesArratList);

         ListView listView = findViewById(R.id.listView);

//         listView.setAdapter(listAdapter);
//         listView.setClickable(true);
//         listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//             @Override
//             public void onItemClick(AdapterView<?> parent, View view, int position, long id ){
//                 Intent i = new Intent(ContentList.this,dataForPlace.class);
//                 i.putExtra("title",title[position]);
//                 i.putExtra("imageid",imageId[position]);
//                 startActivity(i);


     //        }


       //  });

        binding.listView.setAdapter(listAdapter);
        binding.listView.setClickable(true);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id ){
//itho value jandi pai a display karan lai duji screen ch
              Intent i = new Intent(ContentList.this,dataForPlace.class);
                i.putExtra("title",title[position]);
                i.putExtra("imageid",imageId[position]);
                i.putExtra("description",longMessage[position]);
                i.putExtra("uria",locations[position].toString());
              int indexNum = position;

                switch (indexNum){
                    case 0:
                        i.putExtra("imageOne",imageOne[0]);
                        i.putExtra("imageTwo",imageOne[1]);
                        break;
                    case 1:
                        i.putExtra("imageOne",imageTwo[0]);
                        i.putExtra("imageTwo",imageTwo[1]);
                        break;
                    case 2:
                        i.putExtra("imageOne",imageThree[0]);
                        i.putExtra("imageTwo",imageThree[1]);
                        break;
                    case 3:
                        i.putExtra("imageOne",imageFour[0]);
                        i.putExtra("imageTwo",imageFour[1]);
                        break;
                    case 4:
                        i.putExtra("imageOne",imageFive[0]);
                        i.putExtra("imageTwo",imageFive[1]);
                        break;
                    case 5:
                        i.putExtra("imageOne",imageSix[0]);
                        i.putExtra("imageTwo",imageSix[1]);
                        break;
                    case 6:
                        i.putExtra("imageOne",imageSeven[0]);
                        i.putExtra("imageTwo",imageSeven[1]);
                        break;
                    case 7:
                        i.putExtra("imageOne",imageEight[0]);
                        i.putExtra("imageTwo",imageEight[1]);
                        break;
                    case 8:
                        i.putExtra("imageOne",imageNine[0]);
                        i.putExtra("imageTwo",imageNine[1]);
                        break;
                    case 9:
                        i.putExtra("imageOne",imageTen[0]);
                        i.putExtra("imageTwo",imageTen[1]);
                        break;
                    default:
                        i.putExtra("imageOne",imageId[position]);
                        i.putExtra("imageTwo",imageId[position]);
                }


                 startActivity(i);

          }
       });

    }
}