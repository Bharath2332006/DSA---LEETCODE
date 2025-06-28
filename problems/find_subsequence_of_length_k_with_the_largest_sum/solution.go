func maxSubsequence(nums []int, k int) []int {
    newarr:=make([]int,len(nums))
    copy(newarr,nums)
    sort.Ints(nums)
    ans:=[]int{}
    arr:=make([]int,k )
    
    inx:=k-1
    for i:=len(nums)-1;i>=len(nums)-k;i--{
        arr[inx]=nums[i]
        inx--
    }
   count := make(map[int]int)
    for _, v := range arr {
        count[v]++
    }

    outer:
    for i := 0; i < len(newarr); i++ {
        if count[newarr[i]] > 0 {
            ans = append(ans, newarr[i])
            count[newarr[i]]--
            continue outer
        }
    }
    return ans

}