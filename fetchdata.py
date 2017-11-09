from pandas_datareader import data
import matplotlib.pyplot as plt
import pandas as pd

#tickers = ['CVS','AFL','UNH','PYPL','WM','RDS-A','SPY']
tickers = ['MO','AFL','WM','SPY']
tickers2 = ['AFL','UNH','PYPL','WM','RDS-A','SPY']
data_source = 'google'

start_date = '2016-09-01'
end_date = '2017-08-17'

start_date2 = '2017-08-07'
end_date2 = '2017-08-17'

panel_data = data.DataReader(tickers, data_source, start_date, end_date)

panel_data2 = data.DataReader(tickers2, data_source, start_date2, end_date2)

close = panel_data.ix['Close']
close2 = panel_data2.ix['Close']

open = panel_data.ix['Open']

all_weekdays = pd.date_range(start=start_date, end=end_date,freq='B')

close = close.reindex(all_weekdays)

print(close.head(1000))

close.plot(title = 'test graph')
plt.show()



#print(open.head(1000))
#print(close.head(1000)-open.head(1000))
#close.describe()