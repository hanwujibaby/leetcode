import java.util.ArrayList;
import java.util.Collections;

/***
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *
 * 输入: "aba"
 * 输出: True
 *
 *
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意：字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 *
 * solution:双指针从头尾开始遍历，若不一样的话，删除左边或者右边的字符串，判断删除后的字符串是否为回文。
 *
 */
public class Valid_Palindrome2 {

    public static boolean validPalindrome(String s) {
        boolean result = isPalindrome(s);
        int i = 0;
        int j = s.length() - 1;
        char[] cs = s.toCharArray();

        if (result) {
            return result;
        }
        while (i <= j) {
            if (cs[i] == cs[j]) {
                i++;
                j--;
            } else {
                char temp = cs[i];
                cs[i]=' ';
                String s1=String.valueOf(cs);
                result=isPalindrome(s1.trim());
                if(result){
                    return result;
                }
                cs[i]=temp;
                temp=cs[j];
                cs[j]=' ';
                String s2=String.valueOf(cs);
                result=isPalindrome(s2.trim());
                if(result){
                    return result;
                }
                return  result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //String s = "lyjcyxwvartqrbmqpddmushqkalgywgsialtbfysqkmbobaujedobhsmauazbhdsilqkkjuzoqimfqwmfoqeiovstodqqsiyjbkbtshhjsalmbxqaacjmnijyfrwtvqfischpkcrwtozbiwrfvuggqdcinfhhyohizalbzjppztabikdnznbhyolevzutydrbxirjzltcpdglzjtyblflqjkolxymkvdfyqrfbhgwqsnzhuqxfcttlwjigbtennfvbxplzmxdheiaulyhzztwbhtsemruznnqzborldvdfpfjyraxuhceuklfxilxtljyytriyhezhjklykkkijjzquapufkrlsiovnkozlxkjnahpiulsrmykcqavrlriknuoxtdzpzddukfqmyvppndgjvcbuaskqsppsxbhchmtgxqklivlqbmscowxndgxcubnvymipsxohtrmtjyexbmslhhmqklrfvrdimcxykvgvkfocigjimkafxeevdetqjscgqewhaukixtxiivzsklpzcscxgzdlfqjmpkxegtbejckitubhugylihvoqximedxuujhsyzclyyrnvzptfrdhdmocxhgpwjxpxkbougrwwwhkfddyxnvawdirsrydkqstalyqpokivlcwxtmviakkwaqmwguasmmujfrxbhmckhgfwcsghuxcprqawxggdfpegfvolhenffubhsprjbpzkoxzksdyrajrtzmqwvcjvdzthzhwrmdqdmbnqxqibnfwpqbouophshrrbytfaroltdsfrmrnzrtlxskwfbxmieqyrlnpluohqafnfpfgrwjmmnzrgzdlzannsjxvoaxanzlldbrivsesecrdfttvaxsplisqjrsrklmfbtfejpftfxkdgvvdowlpwcafjzxsiwwgbtiphyrqbnjhyrioyaxucxndjwjhjjozdplbljuoizgxwzrydoptnwfminobnwhnearuhhommwxfnzvymbupowhsvvxsyxfldgwheacxksspkeiyrdlwrbktiwuydxqkfpdbsnggwuyfyigpbakxohotqbidrmjsldrpklozbifpcyxismcefvdwxunahkfujenaknczawlcvdfeazizsfzunozorctpdrzczwwdwcdmfhjsmfwjfqihwslydaghcccxvbntdrxkzyohrpgxcjxixdhpkjzsrqwsquauoqdtprdqrfajaqtzyzpussttzfaepgmgjvjvoopvntctdrddsaammvgcehmprmtzumifgjbzvpzprlepczdmwwdrrtvwhhnjatzswboekiajtspxcjgcgviewevutoxvrybxknptsnuysvwccdfmrxjuvptyamcckubbdptpzgaysbzsztjzwtcloqeyvosgmbpfgzbcdouiqfffwfuiawkzkodgckjwkvyuitmqixrjehzdksniqpsrigosupxkkluoiimdzyyhxvsffbkkhdaaxfoiatzsrtbnpgqnrfbosaymnpwmihoctrypveiuxcwtbodtggqxgyhhwtyknhruyhclssxlcmcabshajvtxurrrykkyalhdhbdwvjjhsejlqvnctixnzvukalkphvlwvmcqjeytpwbahfscydpjgcoxjcniptpobbuqirmhcjcesdhgwllnzyjrriduyyaogpqyxuhcvsvrxpvupmbczimxfggplguslywqjhyjyckwjbycbyhyaanuatlezcoiampqwtcgtrssnuhrzhlmuuczbernacccvtcjkzwhrptmzdxquqjvmxqzrvkluhrjekknzmqogbhzhzduvtndyqojylugcqnbjomsyiipsfhiflcnjzgfzkgsdbtqsuzdzjiykxfdjnzgdvcppiqlfmxurhldpcuhxbqytoizqdenexbtsztisrzsokuktzsqvooysvuqwijuxqyzguqnszumukgawzyogkxvkjsjttsjgnaftbgjqdwkjbrpqylyemnqcdllndevrcpmiwsuiipzjnipjbxfkdffmthhlkpqewukaxgworxcfwmlhothsgvhvwgfnpdvsxclprpnsnaiorttjfpiiufgagfbmiffgeikdarhubuaezjuqvgksbeiajjffbztzopyhvjoieduxqodqghkigskimdabcyhlqxxyaemhpriklpqmlbjocmklswahpwgwgzdludqvpiegwguznpclsucuqkvsawdbttfowetonjfjqnjvzdhfuqfpjmxynimnfxuygsztbortaxhxxwyzjwqszresyotfqdrcmwhrdsuelbxobqtnukazqikeijaispuhqpquexbwycxbzvbdbzczhdbrksibjikghthjjswuionrmarutnxqoserlkzioyssxpqhlqwztfvslsoaidgrahfvlvawegcajryevlqhapdfwyllaljqpzgqhjkozturndcksqieawyeazmmdxjcbfdobylfrudnxhlqvsmxyyiehauwvoqfpcuamknhbxgznwgnpggzkolpgfrcouxakuxyqbnzfwiiwdpqognpvksrfwajycyikjhharxlvummqjbduynuaghwvtdeqcbbexzmnyrzxorubfgcbzisaqnejyxxvaxrqxpfnyqyiqdwjaqobzthoxxvcjuwygbqjpaaverwmqmwcqkwrygapuiozsbkyeltsfbqylmbjeirpcmlwupdssmxvwadjxuwjoeeurakjeoqqosojuudzmclnskioxburoijftgbroznqplgddejuyrwcptkoyuqlecohsaftcgkorupqwvmadhemtgbqxwdcnoiobhtuffohsirgybmattgqkxdrtlssddwomxlxrpmsnhygfsyrjioxuurbkupzljrkgkytvzwpjvntqbzowctwjuhvsrzercfblafwcincdfucuwuynvwsxnxqdoqgskeujobuevkcsllfzcaypzfgrtzisouslkaohmoqzcmdzdrjcnasnazpaugxpmtaqewqxqwmqlqrmyyigqrlzczogzfaqnrgisnldfvhjvdpdlgjltsnfxopcluaqlplrdurnkffyfbyuaqwybeaebmhtlnordnvuuyjiukyknpxvamrqqqvlwzgouilfhhzekvgkqmsqhdqikddkwemlqfydfvkyicbmgnwxccmnbzphghoolhazupawvdwplphojedprkpmstcttuaqhxlxhyfziqwvnigwdmtuwutpfqbjmsqjzhomqltlrkavlvueusktbmmouqckzkejcyerrhjbodozzhdxtglaoptpchhdjnoyvtpdsumbrbppchssqbzbqqcsedqtqwhndxrgmyrhyfgzwkbgamfiqcmbcqqclrjvonrsobujtaoridmcrhowykivrhoywffjwpcohahixfwcqrgocsokorujsnveplxqksjytomxmxrlmtzbrjgmnmfzsziosxzhpkygfueazbfhypxqbssthyluexvwvprrickierqmatzimsvrppiibhiwfapptkwbcsjtzbsboabfvhyokdqsigfslwppaabuevsqqamshzzczhyipgiuitoluzgqwwcxnwquwumctqctkxvniathxwulblviimspakbsblgmfgnvxbnllpavkkckfjjlzolbizbigdbksujdsydphyuvzdlwpopwhfgajwmjubtufnbjakoftqftxrawpupkhmihoxqfgzxxdboyqgvolgecagnexhuuieizhlhxsrqefeikqcluzqzypsmkgkmzdrpsilgudqvbbjceltfdbamirhykijczepbrswgmdbxujcbfotwmnjmdhualecpyzusyeetlroakadpxppupmhsmsppniaauwqdjznznqkbakgtyckoazajjgypvzenxapjdgasfjfuqejedtdkvsrtgvmfkwxgwywpbnwffjqkjrrvufvkysgdukmpzqsbflnymgzxktqucxsvhzzrxnjydqblluvegrplvokhxpordaokurylggxvvbiiszjnuqjreecvgegqkohxyvmzypavllhbsstdemtlzmdqhlwkgcyqnuedntoztrwftvldtkuvwmhrklmxyrcynjgcrizpccvevkwjngmwkyorortkaaiajhomskokyawycbqquqbvpzppxbemjnttcqiblschxiulckqhufeibxrblzemrmjrfnbeqadwaytsobfvzflyasevaygvywvvrcidowqfscgynwuesswbbeecdclxwfdcopctdcbzftwmqkdsfkgjmwciiymzhlmfyaqopxbpikxltckgvitxnxbfitzuusqjnhlynlgptejpgnwebjcsmluwrkmsotihynyuhmyzytzcszmfxwgsbyocxvovhigjdpnbiuoqpzxanqzpbosxagibrgkgexeqawxnmmcjwawzgmavjffautdzpxgyxurupaqcweqsvzynqlnjoevagatcrmfeokzpiijvgebridzpmwcfhnwclmggxdsffifmkwiondafvnenolwnezwyrhllslogyjcbtpbecikylqivhbrkistbpdfrqhldylbuqfifcbihnacybphorcbyiivhvttswzzfyqygcdqhnptbeystejhuiyvisgjerevxdgkmksicqeyniilobpxivmfhzilqjyekihpuzrferwodnhoxymzfeyphzmzwjuvfqfetxwovkdmwutckxlsrylqmtsvriaiuhnshiuhcvzyxxatmhazrytobddzfxbicwxxspwnsbgpdanmiepznyvrinotebesqtgwtseanobufqlqbzqlwzqvkonlnscoqofdcslyauaszvlstlnhzfjqvagxzntzjymlyofoleqphtvukpniawecbfltyxdtywwgigxsacfcydgkxolhoswbmbjistxsgdlodufbevixjjxivebfudoldgsxtsijbmbwsohloxkgdycfcasxgigwwytdxytlfbcewainpkuvthpqelofoylmyjztnzxgavqjfzhnltslvzsauaylscdfoqocsnlnokvqzwlqzbqlqfubonaestwgtqsebetonirvynzpeimnadpgbsnwpsxxwcibxfzddbotyrzahmtaxxyzvchuihsnhuiairvstmqlyrslxkctuwmdkvowxtefqfvujwzmzhpyefzmyxohndowrefrzuphikeyjqlizhfmvixpboliinyeqciskmkgdxverejgsivyiuhjetsyebtpnhqdcgyqyfzzwsttvhviiybcrohpbycanhibcfifqublydlhqrfdpbtsikrbhviqlykicebptbcjygolsllhrywzenwlonenvfadnoiwkmfiffsdxggmlcwnhfcwmpzdirbegvjiipzkoefmrctagaveojnlqnyvsqewcqapuruxygxpzdtuaffjvamgzwawjcmmnxwaqexegkgrbigaxsobpzqnaxzpqouibnpdjgihvovxcoybsgwxfmzscztyzymhuynyhitosmkrwulmscjbewngpjetpglnylhnjqsuuztifbxnxtivgkctlxkipbxpoqayfmlhzmyiicwmjgkfsdkqmwtfzbcdtcpocdfwxlcdceebbwsseuwnygcsfqwodicrvvwyvgyavesaylfzvfbostyawdaqebnfrjmrmezlbrxbiefuhqkcluixhcslbiqcttnjmebxppzpvbquqqbcywaykoksmohjaiaaktroroykwmgnjwkvevccpzircgjnycryxmlkrhmwvuktdlvtfwrtzotndeunqycgkwlhqdmzltmedtssbhllvapyzmvyxhokqgegvceerjqunjzsiibvvxgglyrukoadropxhkovlprgevullbqdyjnxrzzhvsxcuqtkxzgmynlfbsqzpmkudgsykvfuvrrjkqjffwnbpwywgxwkfmvgtrsvkdtdejequfjfsagdjpaxnezkvpygjjazaokcytgkabkqnznzjdqwuaainppsmshmpuppxpdakaorlteeysuzypcelauhdmjnmwtofbcjuxbdmgwsrbpezcjikyhrimabdftlecjbbvqduglisprdzmkgkmspyzqzulcqkiefeqrsxhlhzieiuuhxengaceglovgqyobdxxzgfqxohimhkpupwarxtfqtfokajbnfutbujmwjagfhwpopwldzvuyhpdysdjuskbdgibziblozljjfkckkvapllnbxvngfmglbsbkapsmiivlbluwxhtainvxktcqtcmuwuqwnxcwwqgzulotiuigpiyhzczzhsmaqqsveubaappwlsfgisqdkoyhvfbaobsbztjscbwktppafwihbiipprvsmiztamqreikcirrpvwvxeulyhtssbqxpyhfbzaeufgykphzxsoizszfmnmgjrbztmlrxmxmotyjskqxlpevnsjurokoscogrqcwfxihahocpwjffwyohrvikywohrcmdiroatjubosrnovjrlcqqcbmcqifmagbkwzgfyhrymgrxdnhwqtqdescqqbzbqsshcppbrbmusdptvyonjdhhcptpoalgtxdhzzodobjhrreycjekzkcquommbtksueuvlvakrltlqmohzjqsmjbqfptuwutmdwginvwqizfyhxlxhqauttctsmpkrpdejohplpwdvwapuzahloohghpzbnmccxwngmbciykvfdyfqlmewkddkiqdhqsmqkgvkezhhfliuogzwlvqqqrmavxpnkykuijyuuvndronlthmbeaebywqauybfyffknrudrlplqaulcpoxfnstljgldpdvjhvfdlnsigrnqafzgozczlrqgiyymrqlqmwqxqweqatmpxguapzansancjrdzdmczqomhoaklsuosiztrgfzpyaczfllsckveubojueksgqodqxnxswvnyuwucufdcnicwfalbfcrezrsvhujwtcwozbqtnvjpwzvtykgkrjlzpukbruuxoijrysfgyhnsmprxlxmowddssltrdxkqgttambygrishoffuthboioncdwxqbgtmehdamvwqpurokgctfashocelquyoktpcwryujeddglpqnzorbgtfjiorubxoiksnlcmzduujosoqqoejkarueeojwuxjdawvxmssdpuwlmcpriejbmlyqbfstleykbszoiupagyrwkqcwmqmwrevaapjqbgywujcvxxohtzboqajwdqiyqynfpxqrxavxxyjenqasizbcgfburoxzrynmzxebbcqedtvwhgaunyudbjqmmuvlxrahhjkiycyjawfrskvpngoqpdwiiwfznbqyxukaxuocrfgplokzggpngwnzgxbhnkmaucpfqovwuaheiyyxmsvqlhxndurflybodfbcjxdmmzaeywaeiqskcdnrutzokjhqgzpqjlallywfdpahqlveyrjacgewavlvfhargdiaoslsvftzwqlhqpxssyoizklresoqxnturamrnoiuwsjjhthgkijbiskrbdhzczbdbvzbxcywbxeuqpqhupsiajiekiqzakuntqboxbleusdrhwmcrdqftoyserzsqwjzywxxhxatrobtzsgyuxfnminyxmjpfqufhdzvjnqjfjnotewofttbdwasvkqucuslcpnzugwgeipvqduldzgwgwphawslkmcojblmqplkirphmeayxxqlhycbadmiksgikhgqdoqxudeiojvhypoztzbffjjaiebskgvqujzeaubuhradkiegffimbfgagfuiipfjttroiansnprplcxsvdpnfgwvhvgshtohlmwfcxrowgxakuweqpklhhtmffdkfxbjpinjzpiiuswimpcrvednlldcqnmeylyqprbjkwdqjgbtfangjsttjsjkvxkgoyzwagkumuzsnqugzyqxujiwquvsyoovqsztkukoszrsitzstbxenedqziotyqbxhucpdlhruxmflqippcvdgznjdfxkyijzdzusqtbdsgkzfgzjnclfihfspiiysmojbnqcgulyjoqydntvudzhzhbgoqmznkkejrhulkvrzqxmvjquqxdzmtprhwzkjctvcccanrebzcuumlhzrhunssrtgctwqpmaioczeltaunaayhybcybjwkcyjyhjqwylsuglpggfxmizcbmpuvpxrvsvchuxyqpgoayyudirrjyznllwghdsecjchmriqubboptpincjxocgjpdycsfhabwptyejqcmvwlvhpklakuvznxitcnvqljeshjjvwdbhdhlaykkyrrruxtvjahsbacmclxsslchyurhnkytwhhygxqggtdobtwcxuievpyrtcohimwpnmyasobfrnqgpnbtrsztaiofxaadhkkbffsvxhyyzdmiioulkkxpusogirspqinskdzhejrxiqmtiuyvkwjkcgdokzkwaiufwfffqiuodcbzgfpbmgsovyeqolctwzjtzszbsyagzptpdbbukccmaytpvujxrmfdccwvsyunstpnkxbyrvxotuveweivgcgjcxpstjaikeobwsztajnhhwvtrrdwwmdzcpelrpzpvzbjgfimuztmrpmhecgvmmaasddrdtctnvpoovjvjgmgpeafzttssupzyztqajafrqdrptdqouauqswqrszjkphdxixjcxgprhoyzkxrdtnbvxccchgadylswhiqfjwfmsjhfmdcwdwwzczrdptcrozonuzfszizaefdvclwazcnkanejufkhanuxwdvfecmsixycpfibzolkprdlsjmrdibqtohoxkabpgiyfyuwggnsbdpfkqxdyuwitkbrwldryiekpsskxcaehwgdlfxysxvvshwopubmyvznfxwmmohhuraenhwnbonimfwntpodyrzwxgzioujlblpdzojjhjwjdnxcuxayoiryhjnbqryhpitbgwwisxzjfacwplwodvvgdkxftfpjeftbfmlkrsrjqsilpsxavttfdrcesesvirbdllznaxaovxjsnnazldzgrznmmjwrgfpfnfaqhoulpnlryqeimxbfwksxltrznrmrfsdtloraftybrrhshpouobqpwfnbiqxqnbmdqdmrwhzhtzdvjcvwqmztrjarydskzxokzpbjrpshbuffnehlovfgepfdggxwaqrpcxuhgscwfghkcmhbxrfjummsaugwmqawkkaivmtxwclvikopqylatsqkdyrsridwavnxyddfkhwwwrguobkxpxjwpghxcomdhdrftpzvnryylczyshjuuxdemixqovhilyguhbutikcjebtgexkpmjqfldzgxcsczplkszviixtxikuahweqgcsjqtedveexfakmijgicofkvgvkyxcmidrvfrlkqmhhlsmbxeyjtmrthoxspimyvnbucxgdnxwocsmbqlvilkqxgtmhchbxsppsqksaubcvjgdnppvymqfkuddzpzdtxounkirlrvaqckymrsluiphanjkxlzoknvoislrkfupauqzjjikkkylkjhzehyirtyyjltxlixflkuechuxaryjfpfdvdlrobzqnnzurmesthbwtzzhyluaiehdxmzlpxbvfnnetbgijwlttcfxquhznsqwghbfrqyfdvkmyxlokjqlflbytjzlgdpctlzjrixbrdytuzveloyhbnzndkibatzppjzblazihoyhhfnicdqgguvfrwibzotwrckphcsifqvtwrfyjinmjcaaqxbmlasjhhstbkbjyisqqdotsvoieqofmwqfmiqozujkkqlisdhbzauamshbodejuabobmkqsyfbtlaisgwyglakqhsumddpqmbrqtravwxycjyl";
        String s = "deee";
        long t1 = System.currentTimeMillis();
        System.out.println(validPalindrome(s));
        //System.out.println(isPalindrome(s));
        long t2 = System.currentTimeMillis();
        System.out.printf("\ntime:" + (t2 - t1));
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.trim().toLowerCase().toCharArray();
        int i = 0;
        int j = chars.length - 1;
        boolean b = true;
        if (s == null || chars.length == 0) {
            return true;
        }

        while (i <= j) {

            while (i < chars.length && !isLetter(chars[i])) {
                i++;
            }
            if (i == chars.length) {
                return false;
            }

            while (!isLetter(chars[j])) {
                j--;
            }

            if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                b = false;
                break;
            }

        }
        return b;

    }

    static boolean isLetter(char c) {
        return Character.isDigit(c) || Character.isLetter(c);
    }
}
