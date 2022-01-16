class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        list0 = [] 
        list1 =[]   
        for i in range(len(paths)):
            list0.append(paths[i][0])
            list1.append(paths[i][1])
        # print(list0, list1)
        
        for j in range(len(list0)):
            if list1[j] not in list0:
                return list1[j]