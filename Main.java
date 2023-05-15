public class Main{
    public static void main(String[] args) {

        Graph g = new Graph(107, 2);

        //Init
        g.addEdge(0, 2, true);
        g.addEdge(0, 3, true);

        //1
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);

        //2
        g.addEdge(2, 1, false);
        g.addEdge(2, 4, false);

        //3
        g.addEdge(3, 1, false);
        g.addEdge(3, 5, false);

        //4
        g.addEdge(4, 2, false);
        g.addEdge(4, 6, false);

        //5
        g.addEdge(5, 3, false);
        g.addEdge(5, 7, false);

        //6
        g.addEdge(6, 4, false);
        g.addEdge(6, 8, false);

        //7
        g.addEdge(7, 5, false);
        g.addEdge(7, 9, false);

        //8
        g.addEdge(8, 6, false);
        g.addEdge(8, 10, false);


        //9
        g.addEdge(9, 7, false);
        g.addEdge(9, 12, false);

        //10
        g.addEdge(10, 8, false);
        g.addEdge(10, 13, false);
        g.addEdge(10, 14, false);

        //11
        g.addEdge(11, 9, false);
        g.addEdge(11, 15, false);

        //12
        g.addEdge(12, 9, false);
        g.addEdge(12, 16, false);

        //13
        g.addEdge(13, 10, false);
        g.addEdge(13, 17, false);

        //14
        g.addEdge(14, 10, false);
        g.addEdge(14, 18, false);

        //15
        g.addEdge(15, 11, false);
        g.addEdge(15, 17, false);
        g.addEdge(15, 19, false);
        g.addEdge(15, 20, false);

        //16
        g.addEdge(16, 12, false);
        g.addEdge(16, 21, false);

        //17
        g.addEdge(17, 13, false);
        g.addEdge(17, 15, false);

        //18
        g.addEdge(18, 14, false);
        g.addEdge(18, 22, false);
        g.addEdge(18, 23, false);
        g.addEdge(18, 24, false);

        //19
        g.addEdge(19, 15, false);
        g.addEdge(19, 25, false);

        //20
        g.addEdge(20, 15, false);
        g.addEdge(20, 26, false);

        //21
        g.addEdge(21, 16, false);
        g.addEdge(21, 27, false);

        //22
        g.addEdge(22, 18, false);
        g.addEdge(22, 28, false);

        //23
        g.addEdge(23, 18, false);
        g.addEdge(23, 29, false);

        //24
        g.addEdge(24, 18, false);
        g.addEdge(24, 30, false);

        //25
        g.addEdge(25, 19, false);
        g.addEdge(25, 30, false);

        //26
        g.addEdge(26, 20, false);
        g.addEdge(26, 31, false);

        //27
        g.addEdge(27, 21, false);
        g.addEdge(27, 32, false);

        //28
        g.addEdge(28, 22, false);
        g.addEdge(28, 33, false);

        //29
        g.addEdge(29, 23, false);
        g.addEdge(29, 34, false);

        //30
        g.addEdge(30, 24, false);
        g.addEdge(30, 25, false);
        g.addEdge(30, 35, false);

        //31
        g.addEdge(31, 26, false);
        g.addEdge(31, 36, false);
        g.addEdge(31, 49, false);

        //32
        g.addEdge(32, 27, false);
        g.addEdge(32, 37, false);

        //33
        g.addEdge(33, 28, false);
        g.addEdge(33, 38, false);

        //34
        g.addEdge(34, 29, false);
        g.addEdge(34, 39, false);
        g.addEdge(34, 40, false);

        //35
        g.addEdge(35, 30, false);
        g.addEdge(35, 41, false);

        //36
        g.addEdge(36, 31, false);
        g.addEdge(36, 41, false);

        //37
        g.addEdge(37, 32, false);
        g.addEdge(37, 42, false);

        //38
        g.addEdge(38, 33, false);
        g.addEdge(38, 43, false);

        //39
        g.addEdge(39, 34, false);
        g.addEdge(39, 44, false);
        g.addEdge(39, 45, false);

        //40
        g.addEdge(40, 34, false);
        g.addEdge(40, 45, false);
        g.addEdge(40, 46, false);

        //41
        g.addEdge(41, 35, false);
        g.addEdge(41, 36, false);
        g.addEdge(41, 47, false);
        g.addEdge(41, 48, false);

        //42
        g.addEdge(42, 37, false);
        g.addEdge(42, 49, false);

        //43
        g.addEdge(43, 38, false);
        g.addEdge(43, 50, false);

        //44
        g.addEdge(44, 39, false);
        g.addEdge(44, 51, false);

        //45
        g.addEdge(45, 39, false);
        g.addEdge(45, 40, false);
        g.addEdge(45, 52, false);

        //46
        g.addEdge(46, 53, false);
        g.addEdge(46, 52, false);
        g.addEdge(46, 40, false);

        //47
        g.addEdge(47, 41, false);
        g.addEdge(47, 54, false);

        //48
        g.addEdge(48, 41, false);
        g.addEdge(48, 55, false);

        //49
        g.addEdge(49, 31, false);
        g.addEdge(49, 42, false);

        //50
        g.addEdge(50, 43, false);
        g.addEdge(50, 56, false);

        //51
        g.addEdge(51, 44, false);
        g.addEdge(51, 57, false);

        //52
        g.addEdge(52, 58, false);
        g.addEdge(52, 46, false);
        g.addEdge(52, 45, false);

        //53
        g.addEdge(53, 46, false);

        //54
        g.addEdge(54, 47, false);
        g.addEdge(54, 59, false);

        //55
        g.addEdge(55, 48, false);
        g.addEdge(55, 60, false);

        //56
        g.addEdge(56, 50, false);
        g.addEdge(56, 61, false);

        //57
        g.addEdge(57, 51, false);
        g.addEdge(57, 62, false);
        g.addEdge(57, 63, false);
        g.addEdge(57, 64, false);

        //58
        g.addEdge(58, 52, false);

        //59
        g.addEdge(59, 54, false);
        g.addEdge(59, 65, false);

        //60
        g.addEdge(60, 55, false);
        g.addEdge(60, 66, false);

        //61
        g.addEdge(61, 56, false);
        g.addEdge(61, 67, false);

        //62
        g.addEdge(62, 57, false);
        g.addEdge(62, 67, false);

        //63
        g.addEdge(63, 57, false);
        g.addEdge(63, 68, false);

        //64
        g.addEdge(64, 57, false);
        g.addEdge(64, 69, false);

        //65
        g.addEdge(65, 59, false);
        g.addEdge(65, 70, false);

        //66
        g.addEdge(66, 60, false);
        g.addEdge(66, 71, false);

        //67
        g.addEdge(67, 61, false);
        g.addEdge(67, 62, false);

        //68
        g.addEdge(68, 57, false);
        g.addEdge(68, 68, false);

        //69
        g.addEdge(69, 64, false);
        g.addEdge(69, 75, false);

        //70
        g.addEdge(70, 76, false);
        g.addEdge(70, 65, false);

        //71
        g.addEdge(71, 66, false);
        g.addEdge(71, 77, false);

        //72
        g.addEdge(72, 68, false);
        g.addEdge(72, 78, false);

        //73
        g.addEdge(73, 68, false);
        g.addEdge(73, 79, false);

        //74
        g.addEdge(74, 69, false);
        g.addEdge(74, 80, false);

        //75
        g.addEdge(75, 69, false);
        g.addEdge(75, 81, false);

        //76
        g.addEdge(76, 70, false);
        g.addEdge(76, 81, false);

        //77
        g.addEdge(77, 71, false);
        g.addEdge(77, 82, false);

        //78
        g.addEdge(78, 72, false);
        g.addEdge(78, 83, false);

        //79
        g.addEdge(79, 73, false);
        g.addEdge(79, 84, false);

        //80
        g.addEdge(80, 74, false);
        g.addEdge(80, 84, false);

        //81
        g.addEdge(81, 75, false);
        g.addEdge(81, 76, false);
        g.addEdge(81, 85, false);
        g.addEdge(81, 96, false);

        //82
        g.addEdge(82, 77, false);
        g.addEdge(82, 82, false);

        //83
        g.addEdge(83, 78, false);
        g.addEdge(83, 87, false);

        //84
        g.addEdge(84, 79, false);
        g.addEdge(84, 80, false);
        g.addEdge(84, 88, false);
        g.addEdge(84, 89, false);

        //85
        g.addEdge(85, 81, false);
        g.addEdge(85, 90, false);

        //86
        g.addEdge(86, 82, false);
        g.addEdge(86, 91, false);

        //87
        g.addEdge(87, 83, false);
        g.addEdge(87, 92, false);

        //88
        g.addEdge(88, 84, false);
        g.addEdge(88, 93, false);

        //89
        g.addEdge(89, 84, false);
        g.addEdge(89, 94, false);

        //90
        g.addEdge(90, 85, false);
        g.addEdge(90, 94, false);
        g.addEdge(90, 95, false);

        //91
        g.addEdge(91, 86, false);
        g.addEdge(91, 96, false);

        //92
        g.addEdge(92, 87, false);
        g.addEdge(92, 97, false);

        //93
        g.addEdge(93, 88, false);
        g.addEdge(93, 99, false);
        g.addEdge(93, 98, false);

        //94
        g.addEdge(94, 89, false);
        g.addEdge(94, 90, false);

        //95
        g.addEdge(95, 90, false);
        g.addEdge(95, 100, false);

        //96
        g.addEdge(96, 81, false);
        g.addEdge(96, 91, false);

        //97
        g.addEdge(97, 92, false);
        g.addEdge(97, 101, false);

        //98
        g.addEdge(98, 101, false);
        g.addEdge(98, 93, false);

        //99
        g.addEdge(99, 93, false);
        g.addEdge(99, 102, false);

        //100
        g.addEdge(100, 95, false);
        g.addEdge(100, 103, false);

        //101
        g.addEdge(101, 97, false);
        g.addEdge(101, 98, false);

        //102
        g.addEdge(102, 99, false);
        g.addEdge(102, 104, false);

        //103
        g.addEdge(103, 100, false);
        g.addEdge(103, 105, false);

        //104
        g.addEdge(104, 102, false);
        g.addEdge(104, 106, false);

        //105
        g.addEdge(105, 103, false);
        g.addEdge(105, 106, false);

        //106
        g.addEdge(106, 104, true);
        g.addEdge(106, 105, true);



        String start =args[0];
        System.out.println("Este mapa possui 2 moedas\nPos inicial escolhida: "+ start);
        if(Integer.parseInt(start) >= 0 && Integer.parseInt(start) <= g.adj.length){
            g.BFS(Integer.parseInt(start));
            
        }
        else{
            System.out.println("Pos inicial nn encontrada no mapa");  
        }

        
        
             
    }

}