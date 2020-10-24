public class Tests {
    public static void main(String[] args) throws Exception {
        DigraphAM graphAM = new DigraphAM(8);
        graphAM.addArc(0, 4, 1);
        graphAM.addArc(1, 3, 1);
        graphAM.addArc(1, 5, 1);
        graphAM.addArc(2, 1, 1);
        graphAM.addArc(2, 4, 1);
        graphAM.addArc(4, 7, 1);
        graphAM.addArc(5, 6, 1);
        graphAM.addArc(6, 7, 1);
        graphAM.addArc(7, 6, 1);
        System.out.println("Grafo con matrices de adyacencia");
        for (int i = 0; i < graphAM.size(); i++) {
            for (int j = 0; j < graphAM.size(); j++) {
                System.out.print(graphAM.list[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sucesores del nodo 2");
        System.out.println(graphAM.getSuccessors(2));
        System.out.println("El peso entre el nodo 1 y el nodo 3");
        System.out.println(graphAM.getWeight(1, 3));
        System.out.println("Codigo para GraphViz generado apartir del grafo con matrices de adyacencia");
        graphAM.printCodeForGraphViz();

        DigraphAL graphAL = new DigraphAL(8);
        graphAL.addArc(0, 4, 1);
        graphAL.addArc(1, 3, 1);
        graphAL.addArc(1, 5, 1);
        graphAL.addArc(2, 1, 1);
        graphAL.addArc(2, 4, 1);
        graphAL.addArc(4, 7, 1);
        graphAL.addArc(5, 6, 1);
        graphAL.addArc(6, 7, 1);
        graphAL.addArc(7, 6, 1);
        System.out.println("Grafo con listas de adyacencia");
        for (int i = 0; i < graphAL.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < graphAL.list.get(i).size(); j++)
                System.out.print(graphAL.list.get(i).get(j).first + " ");
            System.out.println();
        }
        System.out.println("Sucesores del nodo 2");
        System.out.println(graphAL.getSuccessors(2));
        System.out.println("El peso entre el nodo 1 y el nodo 3");
        System.out.println(graphAL.getWeight(1, 3));
        System.out.println("Codigo para GraphViz generado apartir del grafo con listas de adyacencia");
        graphAL.printCodeForGraphViz();
    }
}