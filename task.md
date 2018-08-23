1.  given one char "a"
    when call CreatePermutation.cal()
    then return ["a"]

2.  given two chars "ab"
    when call CreatePermutation.cal()
    then return ["ab","ba"]

3.  given three chars "abc"
    when call CreatePermutation.cal()
    then return ["abc","acb","bac","bca","cab","cba"]

4.  given three chars "abcd"
    when call CreatePermutation.cal()
    then return permutations.size() is 24