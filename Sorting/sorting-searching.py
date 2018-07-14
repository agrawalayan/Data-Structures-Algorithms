class Sorting:
    def __init__(self, list_1):
        self.list_1 = list_1

        
    def insert_sort(self):
        for i in range(1,len(self.list_1)):
            key = self.list_1[i]
            j = i-1
            while ((j>=0) and (self.list_1[j]>key)):
                self.list_1[j+1] = self.list_1[j]
                j-=1
            self.list_1[j+1] = key    
        print self.list_1

    def selection_sort(self):
        for i in range(len(self.list_1) -1):                                        
            index = i
            min_element = self.list_1[i]
            for j in range(i, len(self.list_1)):
                if (self.list_1[j] < min_element):
                    min_element = self.list_1[j]
                    index = j;
            self.list_1[index] = self.list_1[i]
            self.list_1[i] = min_element
        print self.list_1

    def divide(self,low, high):
        if (low == high):
            return
        else:
            mid = (low + high)/2
            self.divide(low, mid)
            self.divide(mid + 1, high)
            self.conquer(low, mid, high)

    def conquer(self, low, mid, high):
        #print "Called conquer...."
        #print low, " ", mid, " ", high 
        Left_list = [None]*(mid - low +1)
        Right_list = [None]*(high - mid)
        #print Left_list, " ", Right_list
        for i in range(mid - low + 1):
            Left_list[i] = self.list_1[low + i]
        for i in range(high - mid):
            Right_list[i] = self.list_1[i + mid + 1]
        #print Left_list, " ", Right_list  
        i = 0
        j = 0
        k = low
        while ((i < (mid -low + 1)) and (j < (high - mid))):
            if (Left_list[i] < Right_list[j]):
                self.list_1[k] = Left_list[i]
                i+=1
            else:
                self.list_1[k] = Right_list[j]
                j+=1
            k+=1
        #print self.list_1
        while ((i < (mid -low + 1))):
            self.list_1[k] = Left_list[i]
            i+=1
            k+=1
        #print self.list_1
        while ((j < (high - mid))):
            self.list_1[k] = Right_list[j]
            j+=1
            k+=1
        #print self.list_1

    def merge_sort(self):
        self.divide(0, (len(self.list_1) -1))
        print self.list_1

    
class Searching:
    def __init__(self, list_1, find_element):
        self.list_1 = list_1[:]
        self.find_element = find_element
        #print self.list_1

        
    def linear_search(self):
        for i in range(len(self.list_1)):
            if (self.find_element == self.list_1[i]):
                print "Element found at index ", i
                break
            else:
                if (i == len(self.list_1) - 1):
                    print "Element not found"

    def binary_search(self):            # list should be sorted
        low = 0
        high = len(self.list_1) - 1
        while(high >= low):
            mid = (high + low)/2 
            if (self.list_1[mid] == self.find_element):
                print "Element found at index ", mid
                return
            elif (self.list_1[mid] > self.find_element):
                high = mid -1
            else:
                low = mid + 1
            


if __name__ == '__main__':

    list_1 = [5,4,3,6,-8,2,1]
    sorting = Sorting(list_1) 
    sorting.insert_sort()

else :
    print "Module is being imported..." 
