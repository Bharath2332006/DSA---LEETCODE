func missingNumber(nums []int) int {
    var n int=len(nums)
    tot:= n*(n+1)/2
    sum:=0
    for i:=0;i<len(nums);i++{
        sum=sum+nums[i]
    }
    return tot-sum
}