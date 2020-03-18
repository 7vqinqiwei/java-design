package com.wayne.design.leetcode._01数组;

/**
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 *
 * @author
 */
public class _4_寻找两个有序数组的中位数 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1_length = nums1.length;
        int nums2_length = nums2.length;
        int len = nums1_length + nums2_length;

        double Median = 0;

        int i = 0;
        int count = 0;
        int a = 0;
        int b = 0;
        int[] num3 = new int[len];
        while (i < len) {
            //两数组都未遍历完，相互比较后加入
            if (a < nums1_length && b < nums2_length) {
                if (nums1[a] > nums2[b]) {
                    num3[i] = nums2[b];
                    b++;
                    count++;
                } else {
                    num3[i] = nums1[a];
                    a++;
                    count++;
                }
            }
            //num2已经遍历完，无需比较，直接将剩余num1加入
            else if (a < nums1_length) {
                num3[i] = nums1[a];
                a++;
                count++;
            }
            //num1已经遍历完，无需比较，直接将剩余num2加入
            else if (b < nums2_length) {
                num3[i] = nums2[b];
                b++;
                count++;
            }
            if (count == len / 2 + 1) {
                break;
            }
            i++;
        }
        if (len % 2 == 0) {
            double d1 = num3[i];
            double d2 = num3[i - 1];
            Median = (d1 + d2) / 2;
        } else {
            Median = num3[i];
        }
        return Median;
    }

    /**
     * 二分查找
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        return (findMedianSortedArraysHelper(nums1, 0, nums2, 0 , (l1+l2+1)/2) + findMedianSortedArraysHelper (nums1, 0, nums2, 0, (l1+l2+2)/2)) * 0.5;

    }

    public double findMedianSortedArraysHelper(int[] nums1, int start1, int[] nums2, int start2, int k) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if (start1 > l1 - 1) {
            return nums2[k + start2 - 1];
        }
        if (start2 > l2 - 1) {
            return nums1[k + start1 - 1];
        }


        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        int mid1 = (start1 + k/2 - 1) < l1 ? nums1[start1 + k/2 - 1] : Integer.MAX_VALUE;
        int mid2 = (start2 + k/2 - 1) < l2 ? nums2[start2 + k/2 - 1] : Integer.MAX_VALUE;

        if (mid1 < mid2) {
            return findMedianSortedArraysHelper(nums1, start1 + k/2 , nums2, start2, k-k/2);
        } else {
            return findMedianSortedArraysHelper(nums1, start1, nums2, start2 + k/2, k-k/2);
        }
    }

}
