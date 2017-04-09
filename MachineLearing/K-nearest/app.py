import KNN
group,labels = KNN.CreateDataSet()
ret = KNN.classify0([0,0],group,labels,3)
print(ret)
