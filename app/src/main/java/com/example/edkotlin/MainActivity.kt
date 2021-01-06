package com.example.edkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView=findViewById(R.id.lstbebida)
        recyclerView.layoutManager =LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val bebidas=ArrayList<Bebida>()
        bebidas.add(Bebida(1,
                "Pisco Sour ",
                "https://cdn.shopify.com/s/files/1/1578/1289/files/Pisco-Beverage-Peru-Blog-Exploor_2x.jpg?v=1553253590",
                "La bebida nacional peruana más famosa, el Pisco Sour, es un cóctel inventado por un estadounidense en Lima. Luego fue tomado por los peruanos y desde entonces ha sido disfrutado en todo el mundo. El Pisco Sour consiste de un brandy de uva, clara de huevo, jugo de limón y un poco de azúcar. ¡Es una bebida alcohólica muy refrescante que definitivamente tendrás que probar cuándo estés en Perú! ¿Qué tal te parece una cata de Pisco en Lima?"))
        bebidas.add(Bebida(2,
                "Chilcano ",
                "https://cdn.shopify.com/s/files/1/1578/1289/files/Chilcano-Beverage-Peru-Blog-Exploor_2x.jpg?v=1553253649",
                "La versión original del Chilcano se hace con pisco, ginger ale y jugo de limón. Sin embargo, el cóctel se prepara de manera diferente en muchos bares y restaurantes, por ejemplo con frutas exóticas, como la fruta de la pasión, fresa, mango o variantes similares. Aunque el Chilcano no es tan famoso como el Pisco Sour, ¡es una alternativa refrescante que no es tan fuerte!"))
        bebidas.add(Bebida(3,
                "Cerveza",
                "https://cdn.shopify.com/s/files/1/1578/1289/files/Cusquena-Beer-Beverage-Peru-Blog-Exploor_2x.jpg?v=1553253717",
                "Los peruanos beben incluso más cerveza que el pisco sour. Hay tres grandes marcas de cerveza en Perú: Cristal, Cusqueña y Pilsen Callao. Si prefieres una cerveza light, entonces la Cusqueña Premium es la opción adecuada. Si quieres probar algo diferente, prueba una de las otras cervezas Cusqueña, como la cerveza negra. Cristal es la cerveza más popular entre muchos peruanos y se puede comparar con la Corona mexicana. Por último, pero no menos importante, la Pilsen Callao, que se elaboró por primera vez en 1863. Es la cerveza más antigua del Perú."))
        bebidas.add(Bebida(4,
                "Chicha de Jora",
                "https://cdn.shopify.com/s/files/1/1578/1289/files/Chich-de-Jora-Beverage-Peru-Blog-Exploor_2x.jpg?v=1553254791",
                "Continuemos con una bebida tradicional de los Andes, que los incas solían beber: la chicha de Jora. Es una cerveza producida de jora, que es un tipo de trigo andino amarillo. Esta cerveza encontrarás en pequeños pueblos del Valle Sagrado. Lo único de la cerveza es la espesa espuma.\n" +
                        "Un poco de información adicional para ti: la tradición es que arrojen un poco de cerveza al suelo y digan \"Pachamama, Santa Tierra\" como una especie de ofrenda para la \"Pachamama\" (Madre Tierra en Quechua). La chicha de Jora es una bebida muy interesante, que inicialmente tiene un sabor ligeramente dulce y al final un sabor amargo."))
        bebidas.add(Bebida(5,
                "Inca Kola",
                "https://cdn.shopify.com/s/files/1/1578/1289/files/Inca-Cola-Beverage-Peru-Blog-Exploor_2x.jpg?v=1553253831",
                "Inca Kola es una de las bebidas peruanas no alcohólicas más populares, así que de todas maneras deberías probarlo durante tu estadía en Perú. Inca Kola tiene sus orígenes en 1910, cuando una pareja inglesa llamada Jose y Martha Lindley abrió una pequeña tienda en Lima para vender bebidas carbonatadas. Su sabor es similar al Mountain Dew de EEUU, pero la famosa Inca Kola no es tan dulce. Mucha gente dice que la Inca Kola sabe a chicle. ¿Qué piensas?"))
        bebidas.add(Bebida(6,
                "Chicha Morada",
                "https://cdn.shopify.com/s/files/1/1578/1289/files/Chicha-Morada-Beverage-Peru-Blog-Exploor_2x.jpg?v=1553253916",
                "La chicha morada es una bebida peruana muy famosa hecha de maíz morado. El maíz morado tiene su origen en el Perú y los incas ya lo han tomado hace tiempo. Además, la chicha morada tiene numerosos beneficios para la salud, como reducir la presión arterial o reducir la enfermedad cardíaca. Esta bebida sin alcohol está hecha de maíz morado, con piña, canela, azúcar y clavo. Debes probar la chicha morada durante tu estancia en Perú, ya que el sabor es único y probablemente no lo encontrarás en ningún otro lugar."))
        bebidas.add(Bebida(7,
                "Mate de Coca ",
                "https://cdn.shopify.com/s/files/1/1578/1289/files/Coca-Tea-Beverage-Peru-Blog-Exploor_2x.jpg?v=1553253975",
                "El mate de coca es bien conocido especialmente en las regiones andinas y es un té hecho de hojas de coca. Esta bebida es muy popular y se bebe principalmente para evitar el mal de altura o para reducir los efectos. Pero una pequeña recomendación de mi parte: si debes someterte a una prueba de drogas en tu trabajo, deberías evitar el mate de coca para estar seguro. El sabor del mate de coca se puede comparar muy bien con el del té verde."))
        bebidas.add(Bebida(8,
                "Jugos de fruta",
                "https://cdn.shopify.com/s/files/1/1578/1289/files/Fruit-Juices-Beverage-Peru-Blog-Exploor_2x.jpg?v=1553254016",
                "Cuando estás en Perú, no te puedes perder los jugos de frutas peruanas. Perú es un verdadero paraíso de frutas y una de las mejores maneras de disfrutar sus riquezas es con jugos frescos. Puedes encontrar los deliciosos jugos en todas partes, ya sea en restaurantes, cafés o en mercados. La selección de frutas es infinita y va desde frutas normales, como plátanos, papayas, maracuyá y piña hasta las frutas peruanas más famosas, como lúcuma, aguaje, aguaymanto, camu camu, chirimoya, granadilla y mucho más. El \"jugo especial\" es muy delicioso; es una mezcla de diferentes frutas, un huevo y una cerveza cusqueña (opcional). ¡Este jugo da energía y llena como un plato de comida y puedes compartirlo con tu pareja!"))
        bebidas.add(Bebida(9,
                "Emoliente ",
                "https://cdn.shopify.com/s/files/1/1578/1289/files/Emoliente-Beverage-Peru-Blog-Exploor_2x.jpg?v=1553254835",
                "Emoliente es otra bebida peruana única. Esta bebida se vende en la calle, especialmente en invierno, ya que está caliente. Se dice que el emoliente tiene poderes curativos, ya que la base de emoliente consiste en una mezcla de hierba de cebada, cola de caballo seca, semillas de lino, brotes de alfalfa y hojas de plátano. El sabor de la bebida es un poco peculiar: imagínate que bebes algo caliente, afrutado...simplemente es una combinación única. Si no te sientes tan bien durante tu viaje, entonces definitivamente deberías tomar emoliente."))
        val adapter=Adapter(bebidas)
        recyclerView.adapter=adapter

    }
}