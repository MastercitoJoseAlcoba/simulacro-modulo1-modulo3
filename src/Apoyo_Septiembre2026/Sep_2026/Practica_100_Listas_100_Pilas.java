package Apoyo_Septiembre2026.Sep_2026;

import java.util.ArrayList;
import java.util.Stack;

public class Practica_100_Listas_100_Pilas {

    // ============================================================
    // PARTE 1 - 100 EJERCICIOS DE ARRAYLIST
    // En cada ejercicio: antes de ejecutar, intenta predecir la salida.
    // ============================================================

    // ---------------- EJERCICIO LISTA 001 ----------------
    public static void lista001() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 002 ----------------
    public static void lista002() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista.get(1));
    }

    // ---------------- EJERCICIO LISTA 003 ----------------
    public static void lista003() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 004 ----------------
    public static void lista004() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 005 ----------------
    public static void lista005() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 006 ----------------
    public static void lista006() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 007 ----------------
    public static void lista007() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 008 ----------------
    public static void lista008() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- EJERCICIO LISTA 009 ----------------
    public static void lista009() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.size());
    }

    // ---------------- EJERCICIO LISTA 010 ----------------
    public static void lista010() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 011 ----------------
    public static void lista011() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 012 ----------------
    public static void lista012() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(0, 50);
        System.out.println(lista.get(1));
    }

    // ---------------- EJERCICIO LISTA 013 ----------------
    public static void lista013() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 014 ----------------
    public static void lista014() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 015 ----------------
    public static void lista015() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 016 ----------------
    public static void lista016() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 017 ----------------
    public static void lista017() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 018 ----------------
    public static void lista018() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- EJERCICIO LISTA 019 ----------------
    public static void lista019() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(0, 50);
        System.out.println(lista.size());
    }

    // ---------------- EJERCICIO LISTA 020 ----------------
    public static void lista020() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 021 ----------------
    public static void lista021() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 022 ----------------
    public static void lista022() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista.get(1));
    }

    // ---------------- EJERCICIO LISTA 023 ----------------
    public static void lista023() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 024 ----------------
    public static void lista024() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 025 ----------------
    public static void lista025() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 026 ----------------
    public static void lista026() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 027 ----------------
    public static void lista027() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 028 ----------------
    public static void lista028() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        lista.add("Extra");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- EJERCICIO LISTA 029 ----------------
    public static void lista029() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.size());
    }

    // ---------------- EJERCICIO LISTA 030 ----------------
    public static void lista030() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 031 ----------------
    public static void lista031() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 032 ----------------
    public static void lista032() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista.get(1));
    }

    // ---------------- EJERCICIO LISTA 033 ----------------
    public static void lista033() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 034 ----------------
    public static void lista034() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 035 ----------------
    public static void lista035() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 036 ----------------
    public static void lista036() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 037 ----------------
    public static void lista037() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 038 ----------------
    public static void lista038() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- EJERCICIO LISTA 039 ----------------
    public static void lista039() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista.size());
    }

    // ---------------- EJERCICIO LISTA 040 ----------------
    public static void lista040() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 041 ----------------
    public static void lista041() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 042 ----------------
    public static void lista042() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(0, 50);
        System.out.println(lista.get(1));
    }

    // ---------------- EJERCICIO LISTA 043 ----------------
    public static void lista043() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 044 ----------------
    public static void lista044() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 045 ----------------
    public static void lista045() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 046 ----------------
    public static void lista046() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 047 ----------------
    public static void lista047() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 048 ----------------
    public static void lista048() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- EJERCICIO LISTA 049 ----------------
    public static void lista049() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(0, 50);
        System.out.println(lista.size());
    }

    // ---------------- EJERCICIO LISTA 050 ----------------
    public static void lista050() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 051 ----------------
    public static void lista051() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 052 ----------------
    public static void lista052() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista.get(1));
    }

    // ---------------- EJERCICIO LISTA 053 ----------------
    public static void lista053() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 054 ----------------
    public static void lista054() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 055 ----------------
    public static void lista055() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 056 ----------------
    public static void lista056() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 057 ----------------
    public static void lista057() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 058 ----------------
    public static void lista058() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        lista.add("Extra");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- EJERCICIO LISTA 059 ----------------
    public static void lista059() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.size());
    }

    // ---------------- EJERCICIO LISTA 060 ----------------
    public static void lista060() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 061 ----------------
    public static void lista061() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 062 ----------------
    public static void lista062() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista.get(1));
    }

    // ---------------- EJERCICIO LISTA 063 ----------------
    public static void lista063() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 064 ----------------
    public static void lista064() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 065 ----------------
    public static void lista065() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 066 ----------------
    public static void lista066() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 067 ----------------
    public static void lista067() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 068 ----------------
    public static void lista068() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- EJERCICIO LISTA 069 ----------------
    public static void lista069() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.size());
    }

    // ---------------- EJERCICIO LISTA 070 ----------------
    public static void lista070() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 071 ----------------
    public static void lista071() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 072 ----------------
    public static void lista072() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(0, 50);
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista.get(1));
    }

    // ---------------- EJERCICIO LISTA 073 ----------------
    public static void lista073() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 074 ----------------
    public static void lista074() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        lista.add(0, 50);
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 075 ----------------
    public static void lista075() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 076 ----------------
    public static void lista076() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 077 ----------------
    public static void lista077() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        lista.add(0, 50);
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 078 ----------------
    public static void lista078() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- EJERCICIO LISTA 079 ----------------
    public static void lista079() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(0, 50);
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista.size());
    }

    // ---------------- EJERCICIO LISTA 080 ----------------
    public static void lista080() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        // Observa cómo cambian los índices después de add/remove.
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 081 ----------------
    public static void lista081() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 082 ----------------
    public static void lista082() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista.get(1));
    }

    // ---------------- EJERCICIO LISTA 083 ----------------
    public static void lista083() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 084 ----------------
    public static void lista084() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 085 ----------------
    public static void lista085() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 086 ----------------
    public static void lista086() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 087 ----------------
    public static void lista087() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 088 ----------------
    public static void lista088() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        lista.add("Extra");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- EJERCICIO LISTA 089 ----------------
    public static void lista089() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.size());
    }

    // ---------------- EJERCICIO LISTA 090 ----------------
    public static void lista090() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 091 ----------------
    public static void lista091() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 092 ----------------
    public static void lista092() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista.get(1));
    }

    // ---------------- EJERCICIO LISTA 093 ----------------
    public static void lista093() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 094 ----------------
    public static void lista094() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 095 ----------------
    public static void lista095() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 096 ----------------
    public static void lista096() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 097 ----------------
    public static void lista097() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        System.out.println(lista);
    }

    // ---------------- EJERCICIO LISTA 098 ----------------
    public static void lista098() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- EJERCICIO LISTA 099 ----------------
    public static void lista099() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.size());
    }

    // ---------------- EJERCICIO LISTA 100 ----------------
    public static void lista100() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        System.out.println(lista);
    }

    // ============================================================
    // PARTE 2 - 100 EJERCICIOS DE STACK / PILAS
    // Recordatorio: push agrega arriba, pop quita arriba, peek mira arriba.
    // ============================================================

    // ---------------- EJERCICIO PILA 001 ----------------
    public static void pila001() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 002 ----------------
    public static void pila002() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek());
    }

    // ---------------- EJERCICIO PILA 003 ----------------
    public static void pila003() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 004 ----------------
    public static void pila004() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- EJERCICIO PILA 005 ----------------
    public static void pila005() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        System.out.println(pila.search("Python"));
    }

    // ---------------- EJERCICIO PILA 006 ----------------
    public static void pila006() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 007 ----------------
    public static void pila007() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 008 ----------------
    public static void pila008() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        System.out.println(pila.empty());
    }

    // ---------------- EJERCICIO PILA 009 ----------------
    public static void pila009() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila.size());
    }

    // ---------------- EJERCICIO PILA 010 ----------------
    public static void pila010() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- EJERCICIO PILA 011 ----------------
    public static void pila011() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 012 ----------------
    public static void pila012() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(99);
        System.out.println(pila.peek());
    }

    // ---------------- EJERCICIO PILA 013 ----------------
    public static void pila013() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 014 ----------------
    public static void pila014() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        pila.push(99);
        System.out.println(eliminado);
    }

    // ---------------- EJERCICIO PILA 015 ----------------
    public static void pila015() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        pila.push("Extra");
        System.out.println(pila.search("Python"));
    }

    // ---------------- EJERCICIO PILA 016 ----------------
    public static void pila016() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 017 ----------------
    public static void pila017() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        pila.push(99);
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 018 ----------------
    public static void pila018() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        pila.push("Extra");
        System.out.println(pila.empty());
    }

    // ---------------- EJERCICIO PILA 019 ----------------
    public static void pila019() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(99);
        System.out.println(pila.size());
    }

    // ---------------- EJERCICIO PILA 020 ----------------
    public static void pila020() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        pila.push("Extra");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- EJERCICIO PILA 021 ----------------
    public static void pila021() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        if (!pila.empty()) pila.peek();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 022 ----------------
    public static void pila022() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        if (!pila.empty()) pila.peek();
        System.out.println(pila.peek());
    }

    // ---------------- EJERCICIO PILA 023 ----------------
    public static void pila023() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        if (!pila.empty()) pila.peek();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 024 ----------------
    public static void pila024() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- EJERCICIO PILA 025 ----------------
    public static void pila025() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        if (!pila.empty()) pila.peek();
        System.out.println(pila.search("Python"));
    }

    // ---------------- EJERCICIO PILA 026 ----------------
    public static void pila026() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        if (!pila.empty()) pila.peek();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 027 ----------------
    public static void pila027() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 028 ----------------
    public static void pila028() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        if (!pila.empty()) pila.peek();
        System.out.println(pila.empty());
    }

    // ---------------- EJERCICIO PILA 029 ----------------
    public static void pila029() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        if (!pila.empty()) pila.peek();
        System.out.println(pila.size());
    }

    // ---------------- EJERCICIO PILA 030 ----------------
    public static void pila030() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        if (!pila.empty()) pila.peek();
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- EJERCICIO PILA 031 ----------------
    public static void pila031() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 032 ----------------
    public static void pila032() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek());
    }

    // ---------------- EJERCICIO PILA 033 ----------------
    public static void pila033() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 034 ----------------
    public static void pila034() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- EJERCICIO PILA 035 ----------------
    public static void pila035() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        System.out.println(pila.search("Python"));
    }

    // ---------------- EJERCICIO PILA 036 ----------------
    public static void pila036() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 037 ----------------
    public static void pila037() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 038 ----------------
    public static void pila038() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        System.out.println(pila.empty());
    }

    // ---------------- EJERCICIO PILA 039 ----------------
    public static void pila039() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila.size());
    }

    // ---------------- EJERCICIO PILA 040 ----------------
    public static void pila040() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- EJERCICIO PILA 041 ----------------
    public static void pila041() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 042 ----------------
    public static void pila042() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(99);
        System.out.println(pila.peek());
    }

    // ---------------- EJERCICIO PILA 043 ----------------
    public static void pila043() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 044 ----------------
    public static void pila044() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        pila.push(99);
        System.out.println(eliminado);
    }

    // ---------------- EJERCICIO PILA 045 ----------------
    public static void pila045() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        pila.push("Extra");
        System.out.println(pila.search("Python"));
    }

    // ---------------- EJERCICIO PILA 046 ----------------
    public static void pila046() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 047 ----------------
    public static void pila047() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        pila.push(99);
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 048 ----------------
    public static void pila048() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        pila.push("Extra");
        System.out.println(pila.empty());
    }

    // ---------------- EJERCICIO PILA 049 ----------------
    public static void pila049() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(99);
        System.out.println(pila.size());
    }

    // ---------------- EJERCICIO PILA 050 ----------------
    public static void pila050() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        pila.push("Extra");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- EJERCICIO PILA 051 ----------------
    public static void pila051() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        if (!pila.empty()) pila.peek();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 052 ----------------
    public static void pila052() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        if (!pila.empty()) pila.peek();
        System.out.println(pila.peek());
    }

    // ---------------- EJERCICIO PILA 053 ----------------
    public static void pila053() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        if (!pila.empty()) pila.peek();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 054 ----------------
    public static void pila054() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- EJERCICIO PILA 055 ----------------
    public static void pila055() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        if (!pila.empty()) pila.peek();
        System.out.println(pila.search("Python"));
    }

    // ---------------- EJERCICIO PILA 056 ----------------
    public static void pila056() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        if (!pila.empty()) pila.peek();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 057 ----------------
    public static void pila057() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 058 ----------------
    public static void pila058() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        if (!pila.empty()) pila.peek();
        System.out.println(pila.empty());
    }

    // ---------------- EJERCICIO PILA 059 ----------------
    public static void pila059() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        if (!pila.empty()) pila.peek();
        System.out.println(pila.size());
    }

    // ---------------- EJERCICIO PILA 060 ----------------
    public static void pila060() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        if (!pila.empty()) pila.peek();
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- EJERCICIO PILA 061 ----------------
    public static void pila061() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 062 ----------------
    public static void pila062() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek());
    }

    // ---------------- EJERCICIO PILA 063 ----------------
    public static void pila063() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 064 ----------------
    public static void pila064() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- EJERCICIO PILA 065 ----------------
    public static void pila065() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        System.out.println(pila.search("Python"));
    }

    // ---------------- EJERCICIO PILA 066 ----------------
    public static void pila066() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 067 ----------------
    public static void pila067() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 068 ----------------
    public static void pila068() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        System.out.println(pila.empty());
    }

    // ---------------- EJERCICIO PILA 069 ----------------
    public static void pila069() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila.size());
    }

    // ---------------- EJERCICIO PILA 070 ----------------
    public static void pila070() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- EJERCICIO PILA 071 ----------------
    public static void pila071() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 072 ----------------
    public static void pila072() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(99);
        System.out.println(pila.peek());
    }

    // ---------------- EJERCICIO PILA 073 ----------------
    public static void pila073() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 074 ----------------
    public static void pila074() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        pila.push(99);
        System.out.println(eliminado);
    }

    // ---------------- EJERCICIO PILA 075 ----------------
    public static void pila075() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        pila.push("Extra");
        System.out.println(pila.search("Python"));
    }

    // ---------------- EJERCICIO PILA 076 ----------------
    public static void pila076() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 077 ----------------
    public static void pila077() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        pila.push(99);
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 078 ----------------
    public static void pila078() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        pila.push("Extra");
        System.out.println(pila.empty());
    }

    // ---------------- EJERCICIO PILA 079 ----------------
    public static void pila079() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(99);
        System.out.println(pila.size());
    }

    // ---------------- EJERCICIO PILA 080 ----------------
    public static void pila080() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        pila.push("Extra");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- EJERCICIO PILA 081 ----------------
    public static void pila081() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        if (!pila.empty()) pila.peek();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 082 ----------------
    public static void pila082() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        if (!pila.empty()) pila.peek();
        System.out.println(pila.peek());
    }

    // ---------------- EJERCICIO PILA 083 ----------------
    public static void pila083() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        if (!pila.empty()) pila.peek();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 084 ----------------
    public static void pila084() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- EJERCICIO PILA 085 ----------------
    public static void pila085() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        if (!pila.empty()) pila.peek();
        System.out.println(pila.search("Python"));
    }

    // ---------------- EJERCICIO PILA 086 ----------------
    public static void pila086() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        if (!pila.empty()) pila.peek();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 087 ----------------
    public static void pila087() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 088 ----------------
    public static void pila088() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        if (!pila.empty()) pila.peek();
        System.out.println(pila.empty());
    }

    // ---------------- EJERCICIO PILA 089 ----------------
    public static void pila089() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        if (!pila.empty()) pila.peek();
        System.out.println(pila.size());
    }

    // ---------------- EJERCICIO PILA 090 ----------------
    public static void pila090() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        if (!pila.empty()) pila.peek();
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- EJERCICIO PILA 091 ----------------
    public static void pila091() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 092 ----------------
    public static void pila092() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek());
    }

    // ---------------- EJERCICIO PILA 093 ----------------
    public static void pila093() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 094 ----------------
    public static void pila094() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- EJERCICIO PILA 095 ----------------
    public static void pila095() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        System.out.println(pila.search("Python"));
    }

    // ---------------- EJERCICIO PILA 096 ----------------
    public static void pila096() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 097 ----------------
    public static void pila097() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- EJERCICIO PILA 098 ----------------
    public static void pila098() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        System.out.println(pila.empty());
    }

    // ---------------- EJERCICIO PILA 099 ----------------
    public static void pila099() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila.size());
    }

    // ---------------- EJERCICIO PILA 100 ----------------
    public static void pila100() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ============================================================
    // MAIN DE PRÁCTICA
    // Descomenta SOLO el ejercicio que quieras probar.
    // ============================================================
    public static void main(String[] args) {
        // lista001();
        // lista100();
        // pila001();
        // pila100();
    }
}
