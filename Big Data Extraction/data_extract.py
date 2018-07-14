flag_for_loop_break =0
flag_try_loop_break = 0
Data = []
MAX =0
subset = []
summation =0

N = int(raw_input())


for count in range(N):
    space_count = 0
    data = raw_input()
    try:
        space_count = data.count(' ')
        if space_count == N -1:
            flag_try_loop_break = 1
            Data = list(map(int,data.split(' ')))
            break
        elif space_count > N -1:
            raise
    except:
        print "Please provide the proper input of array size = " + str(N)
        flag_try_loop_break = 1
        break
    if flag_try_loop_break == 1:
        break

    
Data.sort()
# 2 4 6 9 10
subset.append(Data[N-1])
for count in range(N-1, 0, -1):
    if (Data[count]%2 == 0):
        if (Data[count - 1]%2 == 0):
            pass
        else:
            subset.append(Data[count-1])
    else:
        if (Data[count - 1]%2 == 0):
            subset.append(Data[count-1])
        else:
            pass

for count in range(len(subset)):
    summation += subset[count]


print summation
    
 



    
