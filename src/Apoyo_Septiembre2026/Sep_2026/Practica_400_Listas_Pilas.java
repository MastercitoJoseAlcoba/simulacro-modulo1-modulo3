package Apoyo_Septiembre2026.Sep_2026;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Practica_400_Listas_Pilas {

    // ============================================================
    // BLOQUE A - 200 EJERCICIOS DE LISTAS
    // 001-100: operaciones básicas
    // 101-200: combinados, recorridos, filtros y transformaciones
    // ============================================================

    // ---------------- LISTA 001 ----------------
    public static void lista001() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        System.out.println(lista);
    }

    // ---------------- LISTA 002 ----------------
    public static void lista002() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista.get(1));
    }

    // ---------------- LISTA 003 ----------------
    public static void lista003() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        System.out.println(lista);
    }

    // ---------------- LISTA 004 ----------------
    public static void lista004() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        System.out.println(lista);
    }

    // ---------------- LISTA 005 ----------------
    public static void lista005() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        System.out.println(lista);
    }

    // ---------------- LISTA 006 ----------------
    public static void lista006() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        System.out.println(lista);
    }

    // ---------------- LISTA 007 ----------------
    public static void lista007() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        System.out.println(lista);
    }

    // ---------------- LISTA 008 ----------------
    public static void lista008() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- LISTA 009 ----------------
    public static void lista009() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.size());
    }

    // ---------------- LISTA 010 ----------------
    public static void lista010() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        System.out.println(lista);
    }

    // ---------------- LISTA 011 ----------------
    public static void lista011() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 012 ----------------
    public static void lista012() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(0, 50);
        System.out.println(lista.get(1));
    }

    // ---------------- LISTA 013 ----------------
    public static void lista013() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 014 ----------------
    public static void lista014() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- LISTA 015 ----------------
    public static void lista015() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 016 ----------------
    public static void lista016() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 017 ----------------
    public static void lista017() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- LISTA 018 ----------------
    public static void lista018() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        lista.add("Extra");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- LISTA 019 ----------------
    public static void lista019() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(0, 50);
        System.out.println(lista.size());
    }

    // ---------------- LISTA 020 ----------------
    public static void lista020() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 021 ----------------
    public static void lista021() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        System.out.println(lista);
    }

    // ---------------- LISTA 022 ----------------
    public static void lista022() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista.get(1));
    }

    // ---------------- LISTA 023 ----------------
    public static void lista023() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        System.out.println(lista);
    }

    // ---------------- LISTA 024 ----------------
    public static void lista024() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        System.out.println(lista);
    }

    // ---------------- LISTA 025 ----------------
    public static void lista025() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        System.out.println(lista);
    }

    // ---------------- LISTA 026 ----------------
    public static void lista026() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        System.out.println(lista);
    }

    // ---------------- LISTA 027 ----------------
    public static void lista027() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        System.out.println(lista);
    }

    // ---------------- LISTA 028 ----------------
    public static void lista028() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- LISTA 029 ----------------
    public static void lista029() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.size());
    }

    // ---------------- LISTA 030 ----------------
    public static void lista030() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        System.out.println(lista);
    }

    // ---------------- LISTA 031 ----------------
    public static void lista031() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 032 ----------------
    public static void lista032() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(0, 50);
        System.out.println(lista.get(1));
    }

    // ---------------- LISTA 033 ----------------
    public static void lista033() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 034 ----------------
    public static void lista034() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- LISTA 035 ----------------
    public static void lista035() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 036 ----------------
    public static void lista036() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 037 ----------------
    public static void lista037() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- LISTA 038 ----------------
    public static void lista038() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        lista.add("Extra");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- LISTA 039 ----------------
    public static void lista039() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(0, 50);
        System.out.println(lista.size());
    }

    // ---------------- LISTA 040 ----------------
    public static void lista040() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 041 ----------------
    public static void lista041() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        System.out.println(lista);
    }

    // ---------------- LISTA 042 ----------------
    public static void lista042() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista.get(1));
    }

    // ---------------- LISTA 043 ----------------
    public static void lista043() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        System.out.println(lista);
    }

    // ---------------- LISTA 044 ----------------
    public static void lista044() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        System.out.println(lista);
    }

    // ---------------- LISTA 045 ----------------
    public static void lista045() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        System.out.println(lista);
    }

    // ---------------- LISTA 046 ----------------
    public static void lista046() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        System.out.println(lista);
    }

    // ---------------- LISTA 047 ----------------
    public static void lista047() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        System.out.println(lista);
    }

    // ---------------- LISTA 048 ----------------
    public static void lista048() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- LISTA 049 ----------------
    public static void lista049() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.size());
    }

    // ---------------- LISTA 050 ----------------
    public static void lista050() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        System.out.println(lista);
    }

    // ---------------- LISTA 051 ----------------
    public static void lista051() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 052 ----------------
    public static void lista052() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(0, 50);
        System.out.println(lista.get(1));
    }

    // ---------------- LISTA 053 ----------------
    public static void lista053() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 054 ----------------
    public static void lista054() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- LISTA 055 ----------------
    public static void lista055() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 056 ----------------
    public static void lista056() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 057 ----------------
    public static void lista057() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- LISTA 058 ----------------
    public static void lista058() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        lista.add("Extra");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- LISTA 059 ----------------
    public static void lista059() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(0, 50);
        System.out.println(lista.size());
    }

    // ---------------- LISTA 060 ----------------
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

    // ---------------- LISTA 061 ----------------
    public static void lista061() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        System.out.println(lista);
    }

    // ---------------- LISTA 062 ----------------
    public static void lista062() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista.get(1));
    }

    // ---------------- LISTA 063 ----------------
    public static void lista063() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        System.out.println(lista);
    }

    // ---------------- LISTA 064 ----------------
    public static void lista064() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        System.out.println(lista);
    }

    // ---------------- LISTA 065 ----------------
    public static void lista065() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        System.out.println(lista);
    }

    // ---------------- LISTA 066 ----------------
    public static void lista066() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        System.out.println(lista);
    }

    // ---------------- LISTA 067 ----------------
    public static void lista067() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        System.out.println(lista);
    }

    // ---------------- LISTA 068 ----------------
    public static void lista068() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- LISTA 069 ----------------
    public static void lista069() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.size());
    }

    // ---------------- LISTA 070 ----------------
    public static void lista070() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        System.out.println(lista);
    }

    // ---------------- LISTA 071 ----------------
    public static void lista071() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 072 ----------------
    public static void lista072() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(0, 50);
        System.out.println(lista.get(1));
    }

    // ---------------- LISTA 073 ----------------
    public static void lista073() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 074 ----------------
    public static void lista074() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- LISTA 075 ----------------
    public static void lista075() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 076 ----------------
    public static void lista076() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 077 ----------------
    public static void lista077() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- LISTA 078 ----------------
    public static void lista078() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        lista.add("Extra");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- LISTA 079 ----------------
    public static void lista079() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(0, 50);
        System.out.println(lista.size());
    }

    // ---------------- LISTA 080 ----------------
    public static void lista080() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 081 ----------------
    public static void lista081() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        System.out.println(lista);
    }

    // ---------------- LISTA 082 ----------------
    public static void lista082() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista.get(1));
    }

    // ---------------- LISTA 083 ----------------
    public static void lista083() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        System.out.println(lista);
    }

    // ---------------- LISTA 084 ----------------
    public static void lista084() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        System.out.println(lista);
    }

    // ---------------- LISTA 085 ----------------
    public static void lista085() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        System.out.println(lista);
    }

    // ---------------- LISTA 086 ----------------
    public static void lista086() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        System.out.println(lista);
    }

    // ---------------- LISTA 087 ----------------
    public static void lista087() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        System.out.println(lista);
    }

    // ---------------- LISTA 088 ----------------
    public static void lista088() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- LISTA 089 ----------------
    public static void lista089() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.size());
    }

    // ---------------- LISTA 090 ----------------
    public static void lista090() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        System.out.println(lista);
    }

    // ---------------- LISTA 091 ----------------
    public static void lista091() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Arroz");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 092 ----------------
    public static void lista092() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(0, 50);
        System.out.println(lista.get(1));
    }

    // ---------------- LISTA 093 ----------------
    public static void lista093() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("C");
        lista.add(1, "B");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 094 ----------------
    public static void lista094() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.set(1, 99);
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- LISTA 095 ----------------
    public static void lista095() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C");
        lista.remove(1);
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 096 ----------------
    public static void lista096() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Banana");
        lista.remove("Pera");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 097 ----------------
    public static void lista097() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.remove(Integer.valueOf(4));
        lista.add(0, 50);
        System.out.println(lista);
    }

    // ---------------- LISTA 098 ----------------
    public static void lista098() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Pedro");
        lista.add("Extra");
        System.out.println(lista.contains("Luis"));
    }

    // ---------------- LISTA 099 ----------------
    public static void lista099() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(0, 50);
        System.out.println(lista.size());
    }

    // ---------------- LISTA 100 ----------------
    public static void lista100() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        lista.add(1, "Negro");
        lista.remove("Verde");
        lista.add("Extra");
        System.out.println(lista);
    }

    // ---------------- LISTA 101 ----------------
    public static void lista101() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) resultado.add(numero * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 102 ----------------
    public static void lista102() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        int suma = 0;
        for (int numero : numeros) suma += numero;
        System.out.println(suma);
    }

    // ---------------- LISTA 103 ----------------
    public static void lista103() {
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("mesa");
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.contains("a")) resultado.add(palabra);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 104 ----------------
    public static void lista104() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        int primero = lista.remove(0);
        lista.add(primero);
        System.out.println(lista);
    }

    // ---------------- LISTA 105 ----------------
    public static void lista105() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        String ultimo = lista.remove(lista.size() - 1);
        lista.add(0, ultimo);
        System.out.println(lista);
    }

    // ---------------- LISTA 106 ----------------
    public static void lista106() {
        List<Integer> lista = new ArrayList<>();
        lista.add(-3);
        lista.add(4);
        lista.add(-7);
        lista.add(8);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : lista) {
            if (numero >= 0) resultado.add(numero);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 107 ----------------
    public static void lista107() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- LISTA 108 ----------------
    public static void lista108() {
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luis");
        for (String nombre : lista) {
            if (nombre.length() > 3) System.out.println(nombre);
        }
    }

    // ---------------- LISTA 109 ----------------
    public static void lista109() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(12);
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) + 1);
        }
        System.out.println(lista);
    }

    // ---------------- LISTA 110 ----------------
    public static void lista110() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.set(1, "Naranja");
        frutas.add(2, "Kiwi");
        frutas.remove(3);
        frutas.add("Melón");
        frutas.remove("Manzana");
        System.out.println(frutas);
    }

    // ---------------- LISTA 111 ----------------
    public static void lista111() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) resultado.add(numero * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 112 ----------------
    public static void lista112() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        int suma = 0;
        for (int numero : numeros) suma += numero;
        System.out.println(suma);
    }

    // ---------------- LISTA 113 ----------------
    public static void lista113() {
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("mesa");
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.contains("a")) resultado.add(palabra);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 114 ----------------
    public static void lista114() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        int primero = lista.remove(0);
        lista.add(primero);
        System.out.println(lista);
    }

    // ---------------- LISTA 115 ----------------
    public static void lista115() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        String ultimo = lista.remove(lista.size() - 1);
        lista.add(0, ultimo);
        System.out.println(lista);
    }

    // ---------------- LISTA 116 ----------------
    public static void lista116() {
        List<Integer> lista = new ArrayList<>();
        lista.add(-3);
        lista.add(4);
        lista.add(-7);
        lista.add(8);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : lista) {
            if (numero >= 0) resultado.add(numero);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 117 ----------------
    public static void lista117() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- LISTA 118 ----------------
    public static void lista118() {
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luis");
        for (String nombre : lista) {
            if (nombre.length() > 3) System.out.println(nombre);
        }
    }

    // ---------------- LISTA 119 ----------------
    public static void lista119() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(12);
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) + 1);
        }
        System.out.println(lista);
    }

    // ---------------- LISTA 120 ----------------
    public static void lista120() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.set(1, "Naranja");
        frutas.add(2, "Kiwi");
        frutas.remove(3);
        frutas.add("Melón");
        frutas.remove("Manzana");
        System.out.println(frutas);
    }

    // ---------------- LISTA 121 ----------------
    public static void lista121() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) resultado.add(numero * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 122 ----------------
    public static void lista122() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        int suma = 0;
        for (int numero : numeros) suma += numero;
        System.out.println(suma);
    }

    // ---------------- LISTA 123 ----------------
    public static void lista123() {
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("mesa");
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.contains("a")) resultado.add(palabra);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 124 ----------------
    public static void lista124() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        int primero = lista.remove(0);
        lista.add(primero);
        System.out.println(lista);
    }

    // ---------------- LISTA 125 ----------------
    public static void lista125() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        String ultimo = lista.remove(lista.size() - 1);
        lista.add(0, ultimo);
        System.out.println(lista);
    }

    // ---------------- LISTA 126 ----------------
    public static void lista126() {
        List<Integer> lista = new ArrayList<>();
        lista.add(-3);
        lista.add(4);
        lista.add(-7);
        lista.add(8);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : lista) {
            if (numero >= 0) resultado.add(numero);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 127 ----------------
    public static void lista127() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- LISTA 128 ----------------
    public static void lista128() {
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luis");
        for (String nombre : lista) {
            if (nombre.length() > 3) System.out.println(nombre);
        }
    }

    // ---------------- LISTA 129 ----------------
    public static void lista129() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(12);
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) + 1);
        }
        System.out.println(lista);
    }

    // ---------------- LISTA 130 ----------------
    public static void lista130() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.set(1, "Naranja");
        frutas.add(2, "Kiwi");
        frutas.remove(3);
        frutas.add("Melón");
        frutas.remove("Manzana");
        System.out.println(frutas);
    }

    // ---------------- LISTA 131 ----------------
    public static void lista131() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) resultado.add(numero * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 132 ----------------
    public static void lista132() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        int suma = 0;
        for (int numero : numeros) suma += numero;
        System.out.println(suma);
    }

    // ---------------- LISTA 133 ----------------
    public static void lista133() {
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("mesa");
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.contains("a")) resultado.add(palabra);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 134 ----------------
    public static void lista134() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        int primero = lista.remove(0);
        lista.add(primero);
        System.out.println(lista);
    }

    // ---------------- LISTA 135 ----------------
    public static void lista135() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        String ultimo = lista.remove(lista.size() - 1);
        lista.add(0, ultimo);
        System.out.println(lista);
    }

    // ---------------- LISTA 136 ----------------
    public static void lista136() {
        List<Integer> lista = new ArrayList<>();
        lista.add(-3);
        lista.add(4);
        lista.add(-7);
        lista.add(8);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : lista) {
            if (numero >= 0) resultado.add(numero);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 137 ----------------
    public static void lista137() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- LISTA 138 ----------------
    public static void lista138() {
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luis");
        for (String nombre : lista) {
            if (nombre.length() > 3) System.out.println(nombre);
        }
    }

    // ---------------- LISTA 139 ----------------
    public static void lista139() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(12);
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) + 1);
        }
        System.out.println(lista);
    }

    // ---------------- LISTA 140 ----------------
    public static void lista140() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.set(1, "Naranja");
        frutas.add(2, "Kiwi");
        frutas.remove(3);
        frutas.add("Melón");
        frutas.remove("Manzana");
        System.out.println(frutas);
    }

    // ---------------- LISTA 141 ----------------
    public static void lista141() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) resultado.add(numero * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 142 ----------------
    public static void lista142() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        int suma = 0;
        for (int numero : numeros) suma += numero;
        System.out.println(suma);
    }

    // ---------------- LISTA 143 ----------------
    public static void lista143() {
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("mesa");
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.contains("a")) resultado.add(palabra);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 144 ----------------
    public static void lista144() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        int primero = lista.remove(0);
        lista.add(primero);
        System.out.println(lista);
    }

    // ---------------- LISTA 145 ----------------
    public static void lista145() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        String ultimo = lista.remove(lista.size() - 1);
        lista.add(0, ultimo);
        System.out.println(lista);
    }

    // ---------------- LISTA 146 ----------------
    public static void lista146() {
        List<Integer> lista = new ArrayList<>();
        lista.add(-3);
        lista.add(4);
        lista.add(-7);
        lista.add(8);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : lista) {
            if (numero >= 0) resultado.add(numero);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 147 ----------------
    public static void lista147() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- LISTA 148 ----------------
    public static void lista148() {
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luis");
        for (String nombre : lista) {
            if (nombre.length() > 3) System.out.println(nombre);
        }
    }

    // ---------------- LISTA 149 ----------------
    public static void lista149() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(12);
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) + 1);
        }
        System.out.println(lista);
    }

    // ---------------- LISTA 150 ----------------
    public static void lista150() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.set(1, "Naranja");
        frutas.add(2, "Kiwi");
        frutas.remove(3);
        frutas.add("Melón");
        frutas.remove("Manzana");
        System.out.println(frutas);
    }

    // ---------------- LISTA 151 ----------------
    public static void lista151() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) resultado.add(numero * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 152 ----------------
    public static void lista152() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        int suma = 0;
        for (int numero : numeros) suma += numero;
        System.out.println(suma);
    }

    // ---------------- LISTA 153 ----------------
    public static void lista153() {
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("mesa");
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.contains("a")) resultado.add(palabra);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 154 ----------------
    public static void lista154() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        int primero = lista.remove(0);
        lista.add(primero);
        System.out.println(lista);
    }

    // ---------------- LISTA 155 ----------------
    public static void lista155() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        String ultimo = lista.remove(lista.size() - 1);
        lista.add(0, ultimo);
        System.out.println(lista);
    }

    // ---------------- LISTA 156 ----------------
    public static void lista156() {
        List<Integer> lista = new ArrayList<>();
        lista.add(-3);
        lista.add(4);
        lista.add(-7);
        lista.add(8);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : lista) {
            if (numero >= 0) resultado.add(numero);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 157 ----------------
    public static void lista157() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- LISTA 158 ----------------
    public static void lista158() {
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luis");
        for (String nombre : lista) {
            if (nombre.length() > 3) System.out.println(nombre);
        }
    }

    // ---------------- LISTA 159 ----------------
    public static void lista159() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(12);
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) + 1);
        }
        System.out.println(lista);
    }

    // ---------------- LISTA 160 ----------------
    public static void lista160() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.set(1, "Naranja");
        frutas.add(2, "Kiwi");
        frutas.remove(3);
        frutas.add("Melón");
        frutas.remove("Manzana");
        System.out.println(frutas);
    }

    // ---------------- LISTA 161 ----------------
    public static void lista161() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) resultado.add(numero * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 162 ----------------
    public static void lista162() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        int suma = 0;
        for (int numero : numeros) suma += numero;
        System.out.println(suma);
    }

    // ---------------- LISTA 163 ----------------
    public static void lista163() {
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("mesa");
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.contains("a")) resultado.add(palabra);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 164 ----------------
    public static void lista164() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        int primero = lista.remove(0);
        lista.add(primero);
        System.out.println(lista);
    }

    // ---------------- LISTA 165 ----------------
    public static void lista165() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        String ultimo = lista.remove(lista.size() - 1);
        lista.add(0, ultimo);
        System.out.println(lista);
    }

    // ---------------- LISTA 166 ----------------
    public static void lista166() {
        List<Integer> lista = new ArrayList<>();
        lista.add(-3);
        lista.add(4);
        lista.add(-7);
        lista.add(8);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : lista) {
            if (numero >= 0) resultado.add(numero);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 167 ----------------
    public static void lista167() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- LISTA 168 ----------------
    public static void lista168() {
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luis");
        for (String nombre : lista) {
            if (nombre.length() > 3) System.out.println(nombre);
        }
    }

    // ---------------- LISTA 169 ----------------
    public static void lista169() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(12);
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) + 1);
        }
        System.out.println(lista);
    }

    // ---------------- LISTA 170 ----------------
    public static void lista170() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.set(1, "Naranja");
        frutas.add(2, "Kiwi");
        frutas.remove(3);
        frutas.add("Melón");
        frutas.remove("Manzana");
        System.out.println(frutas);
    }

    // ---------------- LISTA 171 ----------------
    public static void lista171() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) resultado.add(numero * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 172 ----------------
    public static void lista172() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        int suma = 0;
        for (int numero : numeros) suma += numero;
        System.out.println(suma);
    }

    // ---------------- LISTA 173 ----------------
    public static void lista173() {
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("mesa");
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.contains("a")) resultado.add(palabra);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 174 ----------------
    public static void lista174() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        int primero = lista.remove(0);
        lista.add(primero);
        System.out.println(lista);
    }

    // ---------------- LISTA 175 ----------------
    public static void lista175() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        String ultimo = lista.remove(lista.size() - 1);
        lista.add(0, ultimo);
        System.out.println(lista);
    }

    // ---------------- LISTA 176 ----------------
    public static void lista176() {
        List<Integer> lista = new ArrayList<>();
        lista.add(-3);
        lista.add(4);
        lista.add(-7);
        lista.add(8);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : lista) {
            if (numero >= 0) resultado.add(numero);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 177 ----------------
    public static void lista177() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- LISTA 178 ----------------
    public static void lista178() {
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luis");
        for (String nombre : lista) {
            if (nombre.length() > 3) System.out.println(nombre);
        }
    }

    // ---------------- LISTA 179 ----------------
    public static void lista179() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(12);
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) + 1);
        }
        System.out.println(lista);
    }

    // ---------------- LISTA 180 ----------------
    public static void lista180() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.set(1, "Naranja");
        frutas.add(2, "Kiwi");
        frutas.remove(3);
        frutas.add("Melón");
        frutas.remove("Manzana");
        System.out.println(frutas);
    }

    // ---------------- LISTA 181 ----------------
    public static void lista181() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) resultado.add(numero * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 182 ----------------
    public static void lista182() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        int suma = 0;
        for (int numero : numeros) suma += numero;
        System.out.println(suma);
    }

    // ---------------- LISTA 183 ----------------
    public static void lista183() {
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("mesa");
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.contains("a")) resultado.add(palabra);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 184 ----------------
    public static void lista184() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        int primero = lista.remove(0);
        lista.add(primero);
        System.out.println(lista);
    }

    // ---------------- LISTA 185 ----------------
    public static void lista185() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        String ultimo = lista.remove(lista.size() - 1);
        lista.add(0, ultimo);
        System.out.println(lista);
    }

    // ---------------- LISTA 186 ----------------
    public static void lista186() {
        List<Integer> lista = new ArrayList<>();
        lista.add(-3);
        lista.add(4);
        lista.add(-7);
        lista.add(8);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : lista) {
            if (numero >= 0) resultado.add(numero);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 187 ----------------
    public static void lista187() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- LISTA 188 ----------------
    public static void lista188() {
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luis");
        for (String nombre : lista) {
            if (nombre.length() > 3) System.out.println(nombre);
        }
    }

    // ---------------- LISTA 189 ----------------
    public static void lista189() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(12);
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) + 1);
        }
        System.out.println(lista);
    }

    // ---------------- LISTA 190 ----------------
    public static void lista190() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.set(1, "Naranja");
        frutas.add(2, "Kiwi");
        frutas.remove(3);
        frutas.add("Melón");
        frutas.remove("Manzana");
        System.out.println(frutas);
    }

    // ---------------- LISTA 191 ----------------
    public static void lista191() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) resultado.add(numero * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 192 ----------------
    public static void lista192() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        int suma = 0;
        for (int numero : numeros) suma += numero;
        System.out.println(suma);
    }

    // ---------------- LISTA 193 ----------------
    public static void lista193() {
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("perro");
        palabras.add("mesa");
        List<String> resultado = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.contains("a")) resultado.add(palabra);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 194 ----------------
    public static void lista194() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        int primero = lista.remove(0);
        lista.add(primero);
        System.out.println(lista);
    }

    // ---------------- LISTA 195 ----------------
    public static void lista195() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        String ultimo = lista.remove(lista.size() - 1);
        lista.add(0, ultimo);
        System.out.println(lista);
    }

    // ---------------- LISTA 196 ----------------
    public static void lista196() {
        List<Integer> lista = new ArrayList<>();
        lista.add(-3);
        lista.add(4);
        lista.add(-7);
        lista.add(8);
        List<Integer> resultado = new ArrayList<>();
        for (int numero : lista) {
            if (numero >= 0) resultado.add(numero);
        }
        System.out.println(resultado);
    }

    // ---------------- LISTA 197 ----------------
    public static void lista197() {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int contador = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- LISTA 198 ----------------
    public static void lista198() {
        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Luis");
        for (String nombre : lista) {
            if (nombre.length() > 3) System.out.println(nombre);
        }
    }

    // ---------------- LISTA 199 ----------------
    public static void lista199() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(12);
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, lista.get(i) + 1);
        }
        System.out.println(lista);
    }

    // ---------------- LISTA 200 ----------------
    public static void lista200() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.set(1, "Naranja");
        frutas.add(2, "Kiwi");
        frutas.remove(3);
        frutas.add("Melón");
        frutas.remove("Manzana");
        System.out.println(frutas);
    }

    // ============================================================
    // BLOQUE B - 200 EJERCICIOS DE PILAS / STACK
    // 001-100: push, pop, peek, search, empty
    // 101-200: recorridos, filtros, acumuladores y pila auxiliar
    // ============================================================

    // ---------------- PILA 001 ----------------
    public static void pila001() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        System.out.println(pila);
    }

    // ---------------- PILA 002 ----------------
    public static void pila002() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek());
    }

    // ---------------- PILA 003 ----------------
    public static void pila003() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        System.out.println(pila);
    }

    // ---------------- PILA 004 ----------------
    public static void pila004() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- PILA 005 ----------------
    public static void pila005() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        System.out.println(pila.search("Python"));
    }

    // ---------------- PILA 006 ----------------
    public static void pila006() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        System.out.println(pila);
    }

    // ---------------- PILA 007 ----------------
    public static void pila007() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- PILA 008 ----------------
    public static void pila008() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        System.out.println(pila.empty());
    }

    // ---------------- PILA 009 ----------------
    public static void pila009() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila.size());
    }

    // ---------------- PILA 010 ----------------
    public static void pila010() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- PILA 011 ----------------
    public static void pila011() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 012 ----------------
    public static void pila012() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(99);
        System.out.println(pila.peek());
    }

    // ---------------- PILA 013 ----------------
    public static void pila013() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 014 ----------------
    public static void pila014() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        pila.push(99);
        System.out.println(eliminado);
    }

    // ---------------- PILA 015 ----------------
    public static void pila015() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        pila.push("Extra");
        System.out.println(pila.search("Python"));
    }

    // ---------------- PILA 016 ----------------
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

    // ---------------- PILA 017 ----------------
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

    // ---------------- PILA 018 ----------------
    public static void pila018() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        pila.push("Extra");
        System.out.println(pila.empty());
    }

    // ---------------- PILA 019 ----------------
    public static void pila019() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(99);
        System.out.println(pila.size());
    }

    // ---------------- PILA 020 ----------------
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

    // ---------------- PILA 021 ----------------
    public static void pila021() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        System.out.println(pila);
    }

    // ---------------- PILA 022 ----------------
    public static void pila022() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek());
    }

    // ---------------- PILA 023 ----------------
    public static void pila023() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        System.out.println(pila);
    }

    // ---------------- PILA 024 ----------------
    public static void pila024() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- PILA 025 ----------------
    public static void pila025() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        System.out.println(pila.search("Python"));
    }

    // ---------------- PILA 026 ----------------
    public static void pila026() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        System.out.println(pila);
    }

    // ---------------- PILA 027 ----------------
    public static void pila027() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- PILA 028 ----------------
    public static void pila028() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        System.out.println(pila.empty());
    }

    // ---------------- PILA 029 ----------------
    public static void pila029() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila.size());
    }

    // ---------------- PILA 030 ----------------
    public static void pila030() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- PILA 031 ----------------
    public static void pila031() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 032 ----------------
    public static void pila032() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(99);
        System.out.println(pila.peek());
    }

    // ---------------- PILA 033 ----------------
    public static void pila033() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 034 ----------------
    public static void pila034() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        pila.push(99);
        System.out.println(eliminado);
    }

    // ---------------- PILA 035 ----------------
    public static void pila035() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        pila.push("Extra");
        System.out.println(pila.search("Python"));
    }

    // ---------------- PILA 036 ----------------
    public static void pila036() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 037 ----------------
    public static void pila037() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        pila.push(99);
        System.out.println(pila);
    }

    // ---------------- PILA 038 ----------------
    public static void pila038() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        pila.push("Extra");
        System.out.println(pila.empty());
    }

    // ---------------- PILA 039 ----------------
    public static void pila039() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(99);
        System.out.println(pila.size());
    }

    // ---------------- PILA 040 ----------------
    public static void pila040() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        pila.push("Extra");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- PILA 041 ----------------
    public static void pila041() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        System.out.println(pila);
    }

    // ---------------- PILA 042 ----------------
    public static void pila042() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek());
    }

    // ---------------- PILA 043 ----------------
    public static void pila043() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        System.out.println(pila);
    }

    // ---------------- PILA 044 ----------------
    public static void pila044() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- PILA 045 ----------------
    public static void pila045() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        System.out.println(pila.search("Python"));
    }

    // ---------------- PILA 046 ----------------
    public static void pila046() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        System.out.println(pila);
    }

    // ---------------- PILA 047 ----------------
    public static void pila047() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- PILA 048 ----------------
    public static void pila048() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        System.out.println(pila.empty());
    }

    // ---------------- PILA 049 ----------------
    public static void pila049() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila.size());
    }

    // ---------------- PILA 050 ----------------
    public static void pila050() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- PILA 051 ----------------
    public static void pila051() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 052 ----------------
    public static void pila052() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(99);
        System.out.println(pila.peek());
    }

    // ---------------- PILA 053 ----------------
    public static void pila053() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 054 ----------------
    public static void pila054() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        pila.push(99);
        System.out.println(eliminado);
    }

    // ---------------- PILA 055 ----------------
    public static void pila055() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        pila.push("Extra");
        System.out.println(pila.search("Python"));
    }

    // ---------------- PILA 056 ----------------
    public static void pila056() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 057 ----------------
    public static void pila057() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        pila.push(99);
        System.out.println(pila);
    }

    // ---------------- PILA 058 ----------------
    public static void pila058() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        pila.push("Extra");
        System.out.println(pila.empty());
    }

    // ---------------- PILA 059 ----------------
    public static void pila059() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(99);
        System.out.println(pila.size());
    }

    // ---------------- PILA 060 ----------------
    public static void pila060() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        pila.push("Extra");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- PILA 061 ----------------
    public static void pila061() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        System.out.println(pila);
    }

    // ---------------- PILA 062 ----------------
    public static void pila062() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek());
    }

    // ---------------- PILA 063 ----------------
    public static void pila063() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        System.out.println(pila);
    }

    // ---------------- PILA 064 ----------------
    public static void pila064() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- PILA 065 ----------------
    public static void pila065() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        System.out.println(pila.search("Python"));
    }

    // ---------------- PILA 066 ----------------
    public static void pila066() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        System.out.println(pila);
    }

    // ---------------- PILA 067 ----------------
    public static void pila067() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- PILA 068 ----------------
    public static void pila068() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        System.out.println(pila.empty());
    }

    // ---------------- PILA 069 ----------------
    public static void pila069() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila.size());
    }

    // ---------------- PILA 070 ----------------
    public static void pila070() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- PILA 071 ----------------
    public static void pila071() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 072 ----------------
    public static void pila072() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(99);
        System.out.println(pila.peek());
    }

    // ---------------- PILA 073 ----------------
    public static void pila073() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 074 ----------------
    public static void pila074() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        pila.push(99);
        System.out.println(eliminado);
    }

    // ---------------- PILA 075 ----------------
    public static void pila075() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        pila.push("Extra");
        System.out.println(pila.search("Python"));
    }

    // ---------------- PILA 076 ----------------
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

    // ---------------- PILA 077 ----------------
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

    // ---------------- PILA 078 ----------------
    public static void pila078() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        pila.push("Extra");
        System.out.println(pila.empty());
    }

    // ---------------- PILA 079 ----------------
    public static void pila079() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(99);
        System.out.println(pila.size());
    }

    // ---------------- PILA 080 ----------------
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

    // ---------------- PILA 081 ----------------
    public static void pila081() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        System.out.println(pila);
    }

    // ---------------- PILA 082 ----------------
    public static void pila082() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek());
    }

    // ---------------- PILA 083 ----------------
    public static void pila083() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        System.out.println(pila);
    }

    // ---------------- PILA 084 ----------------
    public static void pila084() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        System.out.println(eliminado);
    }

    // ---------------- PILA 085 ----------------
    public static void pila085() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        System.out.println(pila.search("Python"));
    }

    // ---------------- PILA 086 ----------------
    public static void pila086() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        System.out.println(pila);
    }

    // ---------------- PILA 087 ----------------
    public static void pila087() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        System.out.println(pila);
    }

    // ---------------- PILA 088 ----------------
    public static void pila088() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        System.out.println(pila.empty());
    }

    // ---------------- PILA 089 ----------------
    public static void pila089() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila.size());
    }

    // ---------------- PILA 090 ----------------
    public static void pila090() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- PILA 091 ----------------
    public static void pila091() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 092 ----------------
    public static void pila092() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(99);
        System.out.println(pila.peek());
    }

    // ---------------- PILA 093 ----------------
    public static void pila093() {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        pila.pop();
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 094 ----------------
    public static void pila094() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int eliminado = pila.pop();
        pila.push(99);
        System.out.println(eliminado);
    }

    // ---------------- PILA 095 ----------------
    public static void pila095() {
        Stack<String> pila = new Stack<>();
        pila.push("Java");
        pila.push("Python");
        pila.push("C");
        pila.push("Extra");
        System.out.println(pila.search("Python"));
    }

    // ---------------- PILA 096 ----------------
    public static void pila096() {
        Stack<String> pila = new Stack<>();
        pila.push("Pan");
        pila.push("Leche");
        pila.push("Arroz");
        pila.pop();
        pila.push("Fideos");
        pila.push("Extra");
        System.out.println(pila);
    }

    // ---------------- PILA 097 ----------------
    public static void pila097() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(4);
        pila.push(6);
        int x = pila.pop();
        pila.push(x * 2);
        pila.push(99);
        System.out.println(pila);
    }

    // ---------------- PILA 098 ----------------
    public static void pila098() {
        Stack<String> pila = new Stack<>();
        pila.push("Ana");
        pila.push("Luis");
        pila.push("Pedro");
        pila.push("Extra");
        System.out.println(pila.empty());
    }

    // ---------------- PILA 099 ----------------
    public static void pila099() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(99);
        System.out.println(pila.size());
    }

    // ---------------- PILA 100 ----------------
    public static void pila100() {
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        String eliminado = pila.pop();
        pila.push("Negro");
        pila.push("Extra");
        System.out.println("Eliminado: " + eliminado + " | Final: " + pila);
    }

    // ---------------- PILA 101 ----------------
    public static void pila101() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        while (!pila.empty()) {
            System.out.print(pila.pop() + " ");
        }
    }

    // ---------------- PILA 102 ----------------
    public static void pila102() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int suma = 0;
        while (!pila.empty()) suma += pila.pop();
        System.out.println(suma);
    }

    // ---------------- PILA 103 ----------------
    public static void pila103() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(5);
        pila.push(8);
        int contador = 0;
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- PILA 104 ----------------
    public static void pila104() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        Stack<Integer> otra = new Stack<>();
        while (!pila.empty()) otra.push(pila.pop());
        System.out.println(otra);
    }

    // ---------------- PILA 105 ----------------
    public static void pila105() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) resultado.push(n * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 106 ----------------
    public static void pila106() {
        Stack<String> pila = new Stack<>();
        pila.push("casa");
        pila.push("perro");
        pila.push("mesa");
        while (!pila.empty()) {
            String palabra = pila.pop();
            if (palabra.contains("a")) System.out.println(palabra);
        }
    }

    // ---------------- PILA 107 ----------------
    public static void pila107() {
        Stack<Integer> pila = new Stack<>();
        pila.push(-3);
        pila.push(5);
        pila.push(-7);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            resultado.push(n < 0 ? -n : n);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 108 ----------------
    public static void pila108() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int mayor = pila.pop();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n > mayor) mayor = n;
        }
        System.out.println(mayor);
    }

    // ---------------- PILA 109 ----------------
    public static void pila109() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Java");
        System.out.println("Superior: " + pila.peek());
        String eliminado = pila.pop();
        pila.push("Python");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Actual: " + pila.peek());
        System.out.println("Posición CSS: " + pila.search("CSS"));
        System.out.println("Vacía: " + pila.empty());
        System.out.println("Final: " + pila);
    }

    // ---------------- PILA 110 ----------------
    public static void pila110() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int a = pila.pop();
        int b = pila.pop();
        pila.push(a + b);
        System.out.println(pila);
    }

    // ---------------- PILA 111 ----------------
    public static void pila111() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        while (!pila.empty()) {
            System.out.print(pila.pop() + " ");
        }
    }

    // ---------------- PILA 112 ----------------
    public static void pila112() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int suma = 0;
        while (!pila.empty()) suma += pila.pop();
        System.out.println(suma);
    }

    // ---------------- PILA 113 ----------------
    public static void pila113() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(5);
        pila.push(8);
        int contador = 0;
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- PILA 114 ----------------
    public static void pila114() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        Stack<Integer> otra = new Stack<>();
        while (!pila.empty()) otra.push(pila.pop());
        System.out.println(otra);
    }

    // ---------------- PILA 115 ----------------
    public static void pila115() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) resultado.push(n * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 116 ----------------
    public static void pila116() {
        Stack<String> pila = new Stack<>();
        pila.push("casa");
        pila.push("perro");
        pila.push("mesa");
        while (!pila.empty()) {
            String palabra = pila.pop();
            if (palabra.contains("a")) System.out.println(palabra);
        }
    }

    // ---------------- PILA 117 ----------------
    public static void pila117() {
        Stack<Integer> pila = new Stack<>();
        pila.push(-3);
        pila.push(5);
        pila.push(-7);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            resultado.push(n < 0 ? -n : n);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 118 ----------------
    public static void pila118() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int mayor = pila.pop();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n > mayor) mayor = n;
        }
        System.out.println(mayor);
    }

    // ---------------- PILA 119 ----------------
    public static void pila119() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Java");
        System.out.println("Superior: " + pila.peek());
        String eliminado = pila.pop();
        pila.push("Python");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Actual: " + pila.peek());
        System.out.println("Posición CSS: " + pila.search("CSS"));
        System.out.println("Vacía: " + pila.empty());
        System.out.println("Final: " + pila);
    }

    // ---------------- PILA 120 ----------------
    public static void pila120() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int a = pila.pop();
        int b = pila.pop();
        pila.push(a + b);
        System.out.println(pila);
    }

    // ---------------- PILA 121 ----------------
    public static void pila121() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        while (!pila.empty()) {
            System.out.print(pila.pop() + " ");
        }
    }

    // ---------------- PILA 122 ----------------
    public static void pila122() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int suma = 0;
        while (!pila.empty()) suma += pila.pop();
        System.out.println(suma);
    }

    // ---------------- PILA 123 ----------------
    public static void pila123() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(5);
        pila.push(8);
        int contador = 0;
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- PILA 124 ----------------
    public static void pila124() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        Stack<Integer> otra = new Stack<>();
        while (!pila.empty()) otra.push(pila.pop());
        System.out.println(otra);
    }

    // ---------------- PILA 125 ----------------
    public static void pila125() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) resultado.push(n * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 126 ----------------
    public static void pila126() {
        Stack<String> pila = new Stack<>();
        pila.push("casa");
        pila.push("perro");
        pila.push("mesa");
        while (!pila.empty()) {
            String palabra = pila.pop();
            if (palabra.contains("a")) System.out.println(palabra);
        }
    }

    // ---------------- PILA 127 ----------------
    public static void pila127() {
        Stack<Integer> pila = new Stack<>();
        pila.push(-3);
        pila.push(5);
        pila.push(-7);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            resultado.push(n < 0 ? -n : n);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 128 ----------------
    public static void pila128() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int mayor = pila.pop();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n > mayor) mayor = n;
        }
        System.out.println(mayor);
    }

    // ---------------- PILA 129 ----------------
    public static void pila129() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Java");
        System.out.println("Superior: " + pila.peek());
        String eliminado = pila.pop();
        pila.push("Python");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Actual: " + pila.peek());
        System.out.println("Posición CSS: " + pila.search("CSS"));
        System.out.println("Vacía: " + pila.empty());
        System.out.println("Final: " + pila);
    }

    // ---------------- PILA 130 ----------------
    public static void pila130() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int a = pila.pop();
        int b = pila.pop();
        pila.push(a + b);
        System.out.println(pila);
    }

    // ---------------- PILA 131 ----------------
    public static void pila131() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        while (!pila.empty()) {
            System.out.print(pila.pop() + " ");
        }
    }

    // ---------------- PILA 132 ----------------
    public static void pila132() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int suma = 0;
        while (!pila.empty()) suma += pila.pop();
        System.out.println(suma);
    }

    // ---------------- PILA 133 ----------------
    public static void pila133() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(5);
        pila.push(8);
        int contador = 0;
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- PILA 134 ----------------
    public static void pila134() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        Stack<Integer> otra = new Stack<>();
        while (!pila.empty()) otra.push(pila.pop());
        System.out.println(otra);
    }

    // ---------------- PILA 135 ----------------
    public static void pila135() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) resultado.push(n * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 136 ----------------
    public static void pila136() {
        Stack<String> pila = new Stack<>();
        pila.push("casa");
        pila.push("perro");
        pila.push("mesa");
        while (!pila.empty()) {
            String palabra = pila.pop();
            if (palabra.contains("a")) System.out.println(palabra);
        }
    }

    // ---------------- PILA 137 ----------------
    public static void pila137() {
        Stack<Integer> pila = new Stack<>();
        pila.push(-3);
        pila.push(5);
        pila.push(-7);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            resultado.push(n < 0 ? -n : n);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 138 ----------------
    public static void pila138() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int mayor = pila.pop();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n > mayor) mayor = n;
        }
        System.out.println(mayor);
    }

    // ---------------- PILA 139 ----------------
    public static void pila139() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Java");
        System.out.println("Superior: " + pila.peek());
        String eliminado = pila.pop();
        pila.push("Python");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Actual: " + pila.peek());
        System.out.println("Posición CSS: " + pila.search("CSS"));
        System.out.println("Vacía: " + pila.empty());
        System.out.println("Final: " + pila);
    }

    // ---------------- PILA 140 ----------------
    public static void pila140() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int a = pila.pop();
        int b = pila.pop();
        pila.push(a + b);
        System.out.println(pila);
    }

    // ---------------- PILA 141 ----------------
    public static void pila141() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        while (!pila.empty()) {
            System.out.print(pila.pop() + " ");
        }
    }

    // ---------------- PILA 142 ----------------
    public static void pila142() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int suma = 0;
        while (!pila.empty()) suma += pila.pop();
        System.out.println(suma);
    }

    // ---------------- PILA 143 ----------------
    public static void pila143() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(5);
        pila.push(8);
        int contador = 0;
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- PILA 144 ----------------
    public static void pila144() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        Stack<Integer> otra = new Stack<>();
        while (!pila.empty()) otra.push(pila.pop());
        System.out.println(otra);
    }

    // ---------------- PILA 145 ----------------
    public static void pila145() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) resultado.push(n * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 146 ----------------
    public static void pila146() {
        Stack<String> pila = new Stack<>();
        pila.push("casa");
        pila.push("perro");
        pila.push("mesa");
        while (!pila.empty()) {
            String palabra = pila.pop();
            if (palabra.contains("a")) System.out.println(palabra);
        }
    }

    // ---------------- PILA 147 ----------------
    public static void pila147() {
        Stack<Integer> pila = new Stack<>();
        pila.push(-3);
        pila.push(5);
        pila.push(-7);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            resultado.push(n < 0 ? -n : n);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 148 ----------------
    public static void pila148() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int mayor = pila.pop();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n > mayor) mayor = n;
        }
        System.out.println(mayor);
    }

    // ---------------- PILA 149 ----------------
    public static void pila149() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Java");
        System.out.println("Superior: " + pila.peek());
        String eliminado = pila.pop();
        pila.push("Python");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Actual: " + pila.peek());
        System.out.println("Posición CSS: " + pila.search("CSS"));
        System.out.println("Vacía: " + pila.empty());
        System.out.println("Final: " + pila);
    }

    // ---------------- PILA 150 ----------------
    public static void pila150() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int a = pila.pop();
        int b = pila.pop();
        pila.push(a + b);
        System.out.println(pila);
    }

    // ---------------- PILA 151 ----------------
    public static void pila151() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        while (!pila.empty()) {
            System.out.print(pila.pop() + " ");
        }
    }

    // ---------------- PILA 152 ----------------
    public static void pila152() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int suma = 0;
        while (!pila.empty()) suma += pila.pop();
        System.out.println(suma);
    }

    // ---------------- PILA 153 ----------------
    public static void pila153() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(5);
        pila.push(8);
        int contador = 0;
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- PILA 154 ----------------
    public static void pila154() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        Stack<Integer> otra = new Stack<>();
        while (!pila.empty()) otra.push(pila.pop());
        System.out.println(otra);
    }

    // ---------------- PILA 155 ----------------
    public static void pila155() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) resultado.push(n * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 156 ----------------
    public static void pila156() {
        Stack<String> pila = new Stack<>();
        pila.push("casa");
        pila.push("perro");
        pila.push("mesa");
        while (!pila.empty()) {
            String palabra = pila.pop();
            if (palabra.contains("a")) System.out.println(palabra);
        }
    }

    // ---------------- PILA 157 ----------------
    public static void pila157() {
        Stack<Integer> pila = new Stack<>();
        pila.push(-3);
        pila.push(5);
        pila.push(-7);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            resultado.push(n < 0 ? -n : n);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 158 ----------------
    public static void pila158() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int mayor = pila.pop();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n > mayor) mayor = n;
        }
        System.out.println(mayor);
    }

    // ---------------- PILA 159 ----------------
    public static void pila159() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Java");
        System.out.println("Superior: " + pila.peek());
        String eliminado = pila.pop();
        pila.push("Python");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Actual: " + pila.peek());
        System.out.println("Posición CSS: " + pila.search("CSS"));
        System.out.println("Vacía: " + pila.empty());
        System.out.println("Final: " + pila);
    }

    // ---------------- PILA 160 ----------------
    public static void pila160() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int a = pila.pop();
        int b = pila.pop();
        pila.push(a + b);
        System.out.println(pila);
    }

    // ---------------- PILA 161 ----------------
    public static void pila161() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        while (!pila.empty()) {
            System.out.print(pila.pop() + " ");
        }
    }

    // ---------------- PILA 162 ----------------
    public static void pila162() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int suma = 0;
        while (!pila.empty()) suma += pila.pop();
        System.out.println(suma);
    }

    // ---------------- PILA 163 ----------------
    public static void pila163() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(5);
        pila.push(8);
        int contador = 0;
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- PILA 164 ----------------
    public static void pila164() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        Stack<Integer> otra = new Stack<>();
        while (!pila.empty()) otra.push(pila.pop());
        System.out.println(otra);
    }

    // ---------------- PILA 165 ----------------
    public static void pila165() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) resultado.push(n * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 166 ----------------
    public static void pila166() {
        Stack<String> pila = new Stack<>();
        pila.push("casa");
        pila.push("perro");
        pila.push("mesa");
        while (!pila.empty()) {
            String palabra = pila.pop();
            if (palabra.contains("a")) System.out.println(palabra);
        }
    }

    // ---------------- PILA 167 ----------------
    public static void pila167() {
        Stack<Integer> pila = new Stack<>();
        pila.push(-3);
        pila.push(5);
        pila.push(-7);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            resultado.push(n < 0 ? -n : n);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 168 ----------------
    public static void pila168() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int mayor = pila.pop();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n > mayor) mayor = n;
        }
        System.out.println(mayor);
    }

    // ---------------- PILA 169 ----------------
    public static void pila169() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Java");
        System.out.println("Superior: " + pila.peek());
        String eliminado = pila.pop();
        pila.push("Python");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Actual: " + pila.peek());
        System.out.println("Posición CSS: " + pila.search("CSS"));
        System.out.println("Vacía: " + pila.empty());
        System.out.println("Final: " + pila);
    }

    // ---------------- PILA 170 ----------------
    public static void pila170() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int a = pila.pop();
        int b = pila.pop();
        pila.push(a + b);
        System.out.println(pila);
    }

    // ---------------- PILA 171 ----------------
    public static void pila171() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        while (!pila.empty()) {
            System.out.print(pila.pop() + " ");
        }
    }

    // ---------------- PILA 172 ----------------
    public static void pila172() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int suma = 0;
        while (!pila.empty()) suma += pila.pop();
        System.out.println(suma);
    }

    // ---------------- PILA 173 ----------------
    public static void pila173() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(5);
        pila.push(8);
        int contador = 0;
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- PILA 174 ----------------
    public static void pila174() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        Stack<Integer> otra = new Stack<>();
        while (!pila.empty()) otra.push(pila.pop());
        System.out.println(otra);
    }

    // ---------------- PILA 175 ----------------
    public static void pila175() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) resultado.push(n * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 176 ----------------
    public static void pila176() {
        Stack<String> pila = new Stack<>();
        pila.push("casa");
        pila.push("perro");
        pila.push("mesa");
        while (!pila.empty()) {
            String palabra = pila.pop();
            if (palabra.contains("a")) System.out.println(palabra);
        }
    }

    // ---------------- PILA 177 ----------------
    public static void pila177() {
        Stack<Integer> pila = new Stack<>();
        pila.push(-3);
        pila.push(5);
        pila.push(-7);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            resultado.push(n < 0 ? -n : n);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 178 ----------------
    public static void pila178() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int mayor = pila.pop();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n > mayor) mayor = n;
        }
        System.out.println(mayor);
    }

    // ---------------- PILA 179 ----------------
    public static void pila179() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Java");
        System.out.println("Superior: " + pila.peek());
        String eliminado = pila.pop();
        pila.push("Python");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Actual: " + pila.peek());
        System.out.println("Posición CSS: " + pila.search("CSS"));
        System.out.println("Vacía: " + pila.empty());
        System.out.println("Final: " + pila);
    }

    // ---------------- PILA 180 ----------------
    public static void pila180() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int a = pila.pop();
        int b = pila.pop();
        pila.push(a + b);
        System.out.println(pila);
    }

    // ---------------- PILA 181 ----------------
    public static void pila181() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        while (!pila.empty()) {
            System.out.print(pila.pop() + " ");
        }
    }

    // ---------------- PILA 182 ----------------
    public static void pila182() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int suma = 0;
        while (!pila.empty()) suma += pila.pop();
        System.out.println(suma);
    }

    // ---------------- PILA 183 ----------------
    public static void pila183() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(5);
        pila.push(8);
        int contador = 0;
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- PILA 184 ----------------
    public static void pila184() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        Stack<Integer> otra = new Stack<>();
        while (!pila.empty()) otra.push(pila.pop());
        System.out.println(otra);
    }

    // ---------------- PILA 185 ----------------
    public static void pila185() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) resultado.push(n * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 186 ----------------
    public static void pila186() {
        Stack<String> pila = new Stack<>();
        pila.push("casa");
        pila.push("perro");
        pila.push("mesa");
        while (!pila.empty()) {
            String palabra = pila.pop();
            if (palabra.contains("a")) System.out.println(palabra);
        }
    }

    // ---------------- PILA 187 ----------------
    public static void pila187() {
        Stack<Integer> pila = new Stack<>();
        pila.push(-3);
        pila.push(5);
        pila.push(-7);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            resultado.push(n < 0 ? -n : n);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 188 ----------------
    public static void pila188() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int mayor = pila.pop();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n > mayor) mayor = n;
        }
        System.out.println(mayor);
    }

    // ---------------- PILA 189 ----------------
    public static void pila189() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Java");
        System.out.println("Superior: " + pila.peek());
        String eliminado = pila.pop();
        pila.push("Python");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Actual: " + pila.peek());
        System.out.println("Posición CSS: " + pila.search("CSS"));
        System.out.println("Vacía: " + pila.empty());
        System.out.println("Final: " + pila);
    }

    // ---------------- PILA 190 ----------------
    public static void pila190() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int a = pila.pop();
        int b = pila.pop();
        pila.push(a + b);
        System.out.println(pila);
    }

    // ---------------- PILA 191 ----------------
    public static void pila191() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        while (!pila.empty()) {
            System.out.print(pila.pop() + " ");
        }
    }

    // ---------------- PILA 192 ----------------
    public static void pila192() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int suma = 0;
        while (!pila.empty()) suma += pila.pop();
        System.out.println(suma);
    }

    // ---------------- PILA 193 ----------------
    public static void pila193() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(5);
        pila.push(8);
        int contador = 0;
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) contador++;
        }
        System.out.println(contador);
    }

    // ---------------- PILA 194 ----------------
    public static void pila194() {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        Stack<Integer> otra = new Stack<>();
        while (!pila.empty()) otra.push(pila.pop());
        System.out.println(otra);
    }

    // ---------------- PILA 195 ----------------
    public static void pila195() {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(3);
        pila.push(4);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n % 2 == 0) resultado.push(n * 2);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 196 ----------------
    public static void pila196() {
        Stack<String> pila = new Stack<>();
        pila.push("casa");
        pila.push("perro");
        pila.push("mesa");
        while (!pila.empty()) {
            String palabra = pila.pop();
            if (palabra.contains("a")) System.out.println(palabra);
        }
    }

    // ---------------- PILA 197 ----------------
    public static void pila197() {
        Stack<Integer> pila = new Stack<>();
        pila.push(-3);
        pila.push(5);
        pila.push(-7);
        Stack<Integer> resultado = new Stack<>();
        while (!pila.empty()) {
            int n = pila.pop();
            resultado.push(n < 0 ? -n : n);
        }
        System.out.println(resultado);
    }

    // ---------------- PILA 198 ----------------
    public static void pila198() {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(15);
        int mayor = pila.pop();
        while (!pila.empty()) {
            int n = pila.pop();
            if (n > mayor) mayor = n;
        }
        System.out.println(mayor);
    }

    // ---------------- PILA 199 ----------------
    public static void pila199() {
        Stack<String> pila = new Stack<>();
        pila.push("HTML");
        pila.push("CSS");
        pila.push("JavaScript");
        pila.push("Java");
        System.out.println("Superior: " + pila.peek());
        String eliminado = pila.pop();
        pila.push("Python");
        System.out.println("Eliminado: " + eliminado);
        System.out.println("Actual: " + pila.peek());
        System.out.println("Posición CSS: " + pila.search("CSS"));
        System.out.println("Vacía: " + pila.empty());
        System.out.println("Final: " + pila);
    }

    // ---------------- PILA 200 ----------------
    public static void pila200() {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        int a = pila.pop();
        int b = pila.pop();
        pila.push(a + b);
        System.out.println(pila);
    }

    // ============================================================
    // MAIN DE PRÁCTICA
    // Descomenta un ejercicio por vez.
    // ============================================================
    public static void main(String[] args) {
        // lista001();
        // lista100();
        // lista101();
        // lista200();
        // pila001();
        // pila100();
        // pila101();
        // pila200();
    }
}
