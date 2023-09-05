import matplotlib.pyplot as plt
import pandas as pd
#plt.style.use('bmh')
df=pd.read_csv(r"C:\Users\nagal\OneDrive\Desktop\desktop files\AI&ML\spotify-2023.csv",encoding='ISO-8859-1')
x=df['released_year']
y=df['in_spotify_playlists']
df.index
df.columns
plt.title("No.of Songs released in the Year")
plt.xlabel('year')
plt.ylabel('realesed songs')
#plt.size['figure,figuresize']=(10,6)
plt.bar(x,y)
plt.show()
