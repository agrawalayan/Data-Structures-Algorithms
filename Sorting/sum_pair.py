def add_binary_elements(list_A, list_B):
    # A = <N (M.S.B), N -1 , N -2 ,....... ,1 (L.S.B)> elements containing 0's and 1's
    # B = <N (M.S.B), N -1 , N -2 ,....... ,1 (L.S.B)> elements containing 0's and 1's
    # C = <N + 1 (carry bit) (M.S.B), N  , N -1 ,....... ,1 (L.S.B)> addition of elements of array(list) A and B

    list_C = [None]*(len(list_A)+1)
    carry = 0
    for i in range(len(list_A)-1,-1,-1):
        list_C[i+1] = (list_A[i] + list_B[i] + carry)%2
        carry = (list_A[i] + list_B[i] + carry)/2
    list_C[0] = carry
    print list_C

#list_A = [0,1,1,1]
#list_B = [1,0,0,0]
#add_binary_elements(list_A, list_B)

import Algorithms as algos
def sum_pair(list_S, x):
    sorting = algos.Sorting(list_S)
    sorting.merge_sort()
    for i in range(len(list_S)):
        searching = algos.Searching(list_S, x-list_S[i])
        searching.binary_search()


sum_pair([5,4,3,2,1],8)
    
    
