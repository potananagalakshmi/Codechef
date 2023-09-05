import pandas as pd
import matplotlib.pyplot as plt

# Read the CSV file
df = pd.read_csv(r"C:\Users\nagal\OneDrive\Desktop\desktop files\AI&ML\spotify-2023.csv",encoding='ISO-8859-1')

# Create a bar chart using the correct column names
df[['released_year', 'in_spotify_playlists']].plot(kind='bar')

# Add labels and title
plt.xlabel('Category')
plt.ylabel('Value')
plt.title('Bar Graph Example')

# Show the graph
plt.show()
