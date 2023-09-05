import matplotlib.pyplot as plt
a=[1,2,3,4]
b=[5,6,3,8]
#plt.plot(a,b,c='black',linestyle='dotted',linewidth=5)#dash dotted
#plt.scatter(a,b,c='g',marker='3')
plt.bar(a,b,color='r')
plt.barh(a,b,color='r')
plt.title('Sample Graph')#two types can also be drawn at once in the same space
plt.xlabel('x-axis')
plt.ylabel('y-axis')
#plt.savefig(r'C:\Users\nagal\OneDrive\Desktop\python\graph.jpg')#saving the graph in files 
plt.show()
#plt.savefig(r'C:\Users\nagal\OneDrive\Desktop\python\graph.jpeg')#saving the graph in files
#couldn't write above step after show write above of it.....
