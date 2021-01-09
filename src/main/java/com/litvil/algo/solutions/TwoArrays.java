package com.litvil.algo.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoArrays {
  private int[] alist;
  private int[] blist;

  public TwoArrays(int[] alist, int[] blist) {
    this.alist = alist;
    this.blist = blist;
  }

  public List<Integer> getCommonElementsJava() {
    HashSet<Integer> aset = new HashSet<>(
        Arrays.stream(alist)
            .boxed()
            .collect(Collectors.toList())
    );

    aset.retainAll(Arrays.stream(blist)
        .boxed()
        .collect(Collectors.toList())
    );

    return aset.stream().sorted().collect(Collectors.toList());
  }

  public List<Integer> getCommonElements() {
    final Set<Integer> set = new HashSet<>(Arrays.stream(alist).boxed().collect(Collectors.toList()));
    final List<Integer> result = new LinkedList<>();
    for (int element : blist) {
      if (set.contains(element)) {
        result.add(element);
      }
    }
    return result.stream().sorted().collect(Collectors.toList());
  }
}
