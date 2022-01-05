/*
 * Copyright (c) 2021 CoreLogic, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of CoreLogic, Inc.
 * It is furnished under license and may only be used or copied in accordance
 * with the terms of such license.
 * This software is subject to change without notice and no information
 * contained in it should be construed as commitment by CoreLogic, Inc.
 * CoreLogic, Inc. cannot accept any responsibility, financial or otherwise, for any
 * consequences arising from the use of this software except as otherwise stated in
 * the terms of the license.
 */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Write a program RandomWord.java that reads a sequence of words from standard input and prints one of those words uniformly at random.
 * Do not store the words in an array or list. Instead, use Knuth’s method: when reading the ith word, select it with probability 1/i
 * to be the champion, replacing the previous champion. After reading all of the words, print the surviving champion.
 *
 * @author tkaczenko
 */
public class RandomWord {

    public static void main(String[] args) {
        String str;
        String champion = null;
        double denominator = 1;
        while (!StdIn.isEmpty()) {
            str = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / denominator)) {
                champion = str;
            }
            denominator++;
        }
        StdOut.println(champion);
    }
}
