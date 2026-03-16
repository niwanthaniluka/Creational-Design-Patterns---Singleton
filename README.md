# Java Singleton Design Patterns - Hands On 🚀

[cite_start]මෙම ව්‍යාපෘතිය මඟින් **Object-Oriented Design Patterns** යටතේ එන **Singleton Pattern** එක ප්‍රායෝගිකව (Hands-on) ක්‍රියාත්මක කරන ප්‍රධාන ක්‍රම 5ක් නිරූපණය කරයි[cite: 56, 251]. [cite_start]Singleton රටාව භාවිතා කරන්නේ යම් Class එකකින් සෑදිය හැක්කේ එක් වස්තුවක් (Single Instance) පමණක් බව සහතික කිරීමට සහ එයට ගෝලීය ප්‍රවේශයක් (Global Access Point) ලබා දීමටයි[cite: 233, 234, 235].

---

## 🏗️ Singleton ක්‍රියාත්මක කිරීමේ පියවර (Implementation Details)

[cite_start]Singleton රටාවක් නිර්මාණය කිරීමේදී අත්‍යවශ්‍ය මූලධර්ම 3ක් අනුගමනය කර ඇත[cite: 240]:
1. [cite_start]**Private Constructor**: වෙනත් Class වලට අලුතින් Object සෑදීම වැළැක්වීමට[cite: 241].
2. [cite_start]**Private Static Variable**: එම Class එකේම වර්ගයේ එකම Object එක රඳවා ගැනීමට[cite: 242].
3. [cite_start]**Public Static Method**: එම Object එක ලබා ගැනීමට ඇති එකම ගෝලීය දොරටුව (Global Access Point) ලෙස ක්‍රියා කිරීමට[cite: 243].

---

## 📚 අන්තර්ගතය (Implementation Methods)

[cite_start]පහත දැක්වෙන සෑම ක්‍රමයකදීම `Printer` class එක භාවිතා කරමින් Singleton රටාව ක්‍රියාත්මක කර ඇත[cite: 251]:

### [cite_start]1. Eager Initialization [cite: 252]
Class එක load වන විටම Object එක සාදනු ලබයි. මෙය සරල වන අතර Thread-safe වේ.

### [cite_start]2. Static Block Initialization [cite: 253]
Eager ක්‍රමයට සමාන වන අතර මෙහිදී `static block` එකක් තුළ Object එක සාදයි. මෙය Object එක සෑදීමේදී සිදුවන දෝෂ පාලනය කිරීමට (Exception Handling) උපකාරී වේ.

### [cite_start]3. Lazy Initialization [cite: 254]
වැඩසටහන තුළ ප්‍රථම වතාවට Object එකක් ඉල්ලා සිටින විට පමණක් එය නිර්මාණය කරයි. මෙය මතකය (Memory) ඉතිරි කිරීමට උපකාරී වේ.

### [cite_start]4. Thread Safe Singleton [cite: 255]
Multi-threaded පරිසරයකදී පවා එක් Object එකක් පමණක් පවතින බව සහතික කිරීමට `synchronized` කීවර්ඩ් එක භාවිතා කරයි.

### [cite_start]5. Bill Pugh Singleton Implementation [cite: 256]
Inner static helper class එකක් භාවිතා කරයි. මෙය `synchronized` භාවිතයෙන් තොරව ආරක්ෂිතව සහ කාර්යක්ෂමව Singleton සාදන වඩාත් නිර්දේශිත ක්‍රමයයි.

---

## 🛠️ පරීක්ෂා කර බලන ආකාරය (How to Test)

1. [cite_start]ඔබේ පරිගණකයේ **IntelliJ IDEA** ස්ථාපනය කර තිබිය යුතුය[cite: 245].
2. මෙම ව්‍යාපෘතිය පූරණය කර එක් එක් Package එකේ ඇති `Main.java` ගොනුව Run කරන්න.
3. ලැබෙන Output එකේ HashCode අගයන් පරීක්ෂා කරන්න:
   - **HashCode අගයන් සමාන නම්**: Singleton රටාව නිවැරදිව ක්‍රියාත්මක වේ.
   - **HashCode අගයන් වෙනස් නම්**: Singleton රටාවේ දෝෂයක් පවතී.

---

## 🎓 පාඨමාලා තොරතුරු (Course Info)

* [cite_start]**Course**: Advanced Programming (ICT3112) [cite: 1, 2]
* [cite_start]**University**: University of Ruhuna, Faculty of Technology [cite: 4]
* **Lecturer**: P.H.P. [cite_start]Nuwan Laksiri [cite: 4]
* [cite_start]**Reference**: Head First Design Patterns [cite: 401]

---

[cite_start]**Next Step:** ඔබට මෙම Singleton ක්‍රම වල ඇති වාසි සහ අවාසි (Advantages and Disadvantages) වගුවක් ලෙස අවශ්‍යද? [cite: 281]
